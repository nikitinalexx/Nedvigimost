package com.nedvigimost.dao.impl;

import com.nedvigimost.dao.interfaces.IStatisticsDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.stat.Statistics;
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
public class HibernateStatisticsDAO implements IStatisticsDAO{
    @PersistenceContext
    private EntityManager em;

}
