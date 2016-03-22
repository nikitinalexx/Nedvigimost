package com.nedvigimost.dao.impl;

import com.nedvigimost.dao.interfaces.IOrderDAO;
import com.nedvigimost.vo.Order;
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
public class HibernateOrderDAO implements IOrderDAO{
    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addOrder(Order order) {
        Session session = currentSession();
        Transaction tx = session.beginTransaction();
        int id = (Integer) session.save(order);
        order.setIdOrder(id);
        session.flush();
    }

    @Override
    public Order getOrderById(int id) {
        return (Order) currentSession().get(Order.class, id);
    }

    @Override
    public void saveOrder(Order order) {
        Session session = currentSession();
        Transaction tx = session.beginTransaction();
        session.update(order);
        session.flush();
    }

    @Override
    public void removeOrder(Order order) {
        Session session = currentSession();
        Transaction tx = session.beginTransaction();
        session.delete(order);
        session.flush();
    }
}
