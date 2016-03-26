package com.nedvigimost.dao.impl;

import com.nedvigimost.dao.interfaces.IPersonDAO;
import com.nedvigimost.vo.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Alexis on 20.03.2016.
 */
@Repository
@Transactional
public class HibernatePersonDAO implements IPersonDAO{
    @PersistenceContext
    private EntityManager em;

    public void addPerson(Person person) {
        em.persist(person);
    }

    public Person getPersonById(int id) {
        return em.find(Person.class, id);
    }

    public void savePerson(Person person) {
        em.merge(person);
    }

    public void removePerson(Person person) {
        em.remove(person);
    }
}
