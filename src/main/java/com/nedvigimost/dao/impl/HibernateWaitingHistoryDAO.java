package com.nedvigimost.dao.impl;

import com.nedvigimost.dao.interfaces.IWaitingHistoryDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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
}