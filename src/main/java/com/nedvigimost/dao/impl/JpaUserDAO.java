package com.nedvigimost.dao.impl;

import com.nedvigimost.dao.interfaces.IUserDAO;
import com.nedvigimost.vo.Building;
import com.nedvigimost.vo.Person;
import com.nedvigimost.vo.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Alexis on 20.03.2016.
 */
@Repository
@Transactional
public class JpaUserDAO implements IUserDAO {
    @PersistenceContext
    private EntityManager em;

    public void addUser(User user) {
        em.persist(user);
    }

    public User getUserById(int id) {
        return em.find(User.class, id);
    }

    public void saveUser(User user) {
        em.merge(user);
    }

    public void removeUser(User user) {
        em.remove(user);
    }

    public List<User> getAllUsers() {
        Query query = em.createNamedQuery("getAllUsers");
        return query.getResultList();
    }
}
