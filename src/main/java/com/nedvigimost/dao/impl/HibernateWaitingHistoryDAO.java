package com.nedvigimost.dao.impl;

import com.nedvigimost.dao.interfaces.IWaitingHistoryDAO;
import com.nedvigimost.vo.Person;
import com.nedvigimost.vo.WaitingHistory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Alexis on 20.03.2016.
 */
@Repository
public class HibernateWaitingHistoryDAO implements IWaitingHistoryDAO {
    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addWaitingHistory(WaitingHistory waitingHistory) {
        Session session = currentSession();
        Transaction tx = session.beginTransaction();
        int id = (Integer) session.save(waitingHistory);
        waitingHistory.setIdWaitingHistory(id);
        session.flush();
    }

    @Override
    public WaitingHistory getWaitingHistoryById(int id) {
        return (WaitingHistory) currentSession().get(WaitingHistory.class, id);
    }

    @Override
    public void saveWaitingHistory(WaitingHistory waitingHistory) {
        Session session = currentSession();
        Transaction tx = session.beginTransaction();
        session.update(waitingHistory);
        session.flush();
    }

    @Override
    public void removeWaitingHistory(WaitingHistory waitingHistory) {
        Session session = currentSession();
        Transaction tx = session.beginTransaction();
        session.delete(waitingHistory);
        session.flush();
    }
}
