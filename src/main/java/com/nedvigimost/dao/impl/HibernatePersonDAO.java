package com.nedvigimost.dao.impl;

import com.nedvigimost.dao.interfaces.IPersonDAO;
import com.nedvigimost.vo.Person;
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
public class HibernatePersonDAO implements IPersonDAO{
    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void addPerson(Person person) {
        Session session = currentSession();
        Transaction tx = session.beginTransaction();
        int id = (Integer) session.save(person);
        person.setIdPerson(id);
        session.flush();
    }

    public Person getPersonById(int id) {
        return (Person) currentSession().get(Person.class, id);
    }

    public void savePerson(Person person) {
        Session session = currentSession();
        Transaction tx = session.beginTransaction();
        session.update(person);
        session.flush();
    }

    public void removePerson(Person person) {
        Session session = currentSession();
        Transaction tx = session.beginTransaction();
        session.delete(person);
        session.flush();
    }
}
