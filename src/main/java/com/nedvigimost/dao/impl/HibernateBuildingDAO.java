package com.nedvigimost.dao.impl;

import com.nedvigimost.dao.interfaces.IBuildingDAO;
import com.nedvigimost.vo.Building;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Alexis on 20.03.2016.
 */
@Repository
public class HibernateBuildingDAO implements IBuildingDAO{
    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }
}
