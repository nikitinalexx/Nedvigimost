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
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Alexis on 20.03.2016.
 */
@Repository
@Transactional
public class HibernateBuildingDAO implements IBuildingDAO{
    @PersistenceContext
    private EntityManager em;

    public void addBuilding(Building building) {
        em.persist(building);
    }

    public Building getBuildingById(int id) {
        return em.find(Building.class, id);
    }

    public void saveBuilding(Building building) {
        em.merge(building);
    }

    public void removeBuilding(Building building) {
        em.remove(building);
    }
}
