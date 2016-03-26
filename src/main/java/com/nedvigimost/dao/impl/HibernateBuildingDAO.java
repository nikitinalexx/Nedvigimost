package com.nedvigimost.dao.impl;

import com.nedvigimost.dao.interfaces.IBuildingDAO;
import com.nedvigimost.vo.Building;
import com.nedvigimost.vo.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

    public void addBuilding(Building building) {
        Session session = currentSession();
        Transaction tx = session.beginTransaction();
        int id = (Integer) session.save(building);
        building.setIdBuilding(id);
        session.flush();
    }

    public Building getBuildingById(int id) {
        return (Building) currentSession().get(Building.class, id);
    }

    public void saveBuilding(Building building) {
        Session session = currentSession();
        Transaction tx = session.beginTransaction();
        session.update(building);
        session.flush();
    }

    public void removeBuilding(Building building) {
        Session session = currentSession();
        Transaction tx = session.beginTransaction();
        session.delete(building);
        session.flush();
    }
}
