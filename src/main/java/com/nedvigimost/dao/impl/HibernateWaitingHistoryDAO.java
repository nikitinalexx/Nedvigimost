package com.nedvigimost.dao.impl;

import com.nedvigimost.dao.interfaces.IWaitingHistoryDAO;
import com.nedvigimost.vo.Person;
import com.nedvigimost.vo.WaitingHistory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Alexis on 20.03.2016.
 */
@Repository
@Transactional
public class HibernateWaitingHistoryDAO implements IWaitingHistoryDAO {
    @PersistenceContext
    private EntityManager em;

    public void addWaitingHistory(WaitingHistory waitingHistory) {
        em.persist(waitingHistory);
    }

    public WaitingHistory getWaitingHistoryById(int id) {
        return em.find(WaitingHistory.class, id);
    }

    public void saveWaitingHistory(WaitingHistory waitingHistory) {
        em.merge(waitingHistory);
    }

    public void removeWaitingHistory(WaitingHistory waitingHistory) {
        em.remove(waitingHistory);
    }
}
