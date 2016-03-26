package com.nedvigimost.dao.impl;

import com.nedvigimost.dao.interfaces.IOrderDAO;
import com.nedvigimost.vo.Building;
import com.nedvigimost.vo.Order;
import com.nedvigimost.vo.Person;
import com.nedvigimost.vo.WaitingHistory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Alexis on 20.03.2016.
 */
@Repository
@Transactional
public class JpaOrderDAO implements IOrderDAO{
    @PersistenceContext
    private EntityManager em;

    public void addOrder(Order order) {
        em.persist(order);
    }

    public Order getOrderById(int id) {
        return em.find(Order.class, id);
    }

    public void saveOrder(Order order) {
        em.merge(order);
    }

    public void removeOrder(Order order) {
        em.remove(order);
    }

    public List<Order> getBuildingOrders(Building building) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public Order processWaitingHistory(WaitingHistory waitingHistory) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
