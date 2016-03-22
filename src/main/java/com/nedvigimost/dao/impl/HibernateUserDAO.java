package com.nedvigimost.dao.impl;

import com.nedvigimost.dao.interfaces.IUserDAO;
import com.nedvigimost.vo.Person;
import com.nedvigimost.vo.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Alexis on 20.03.2016.
 */
@Repository
public class HibernateUserDAO implements IUserDAO {
    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addUser(User user) {
        Session session = currentSession();
        Transaction tx = session.beginTransaction();
        int id = (Integer) session.save(user);
        user.setIdUser(id);
        session.flush();
    }

    @Override
    public User getUserById(int id) {
        return (User) currentSession().get(User.class, id);
    }

    @Override
    public void saveUser(User user) {
        Session session = currentSession();
        Transaction tx = session.beginTransaction();
        session.update(user);
        session.flush();
    }

    @Override
    public void removeUser(User user) {
        Session session = currentSession();
        Transaction tx = session.beginTransaction();
        session.delete(user);
        session.flush();
    }
}
