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
import javax.persistence.Query;
import java.security.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Alexis on 20.03.2016.
 */
@Repository
@Transactional
public class JpaBuildingDAO implements IBuildingDAO{
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

    public List<Building> getSoldOrRentedBuildings() {
        Query query = em.createNamedQuery("getSoldOrRentedBuildings");
        Calendar currentDate = Calendar.getInstance();
        currentDate.setTime(new Date());
        query.setParameter("currentDate", currentDate);
        return query.getResultList();
    }

    public List<Building> getBuildingsLike(Building from, Building to) {
        StringBuilder jpqlQuery = new StringBuilder();
        jpqlQuery.append("select b from Building b where b.animalsAllowed = ");
        jpqlQuery.append(from.getAnimalsAllowed());
        if (from.getNumOfFloors() != 0 && to.getNumOfFloors() > from.getNumOfFloors()) {
            jpqlQuery.append(" and b.numOfFloors >= ");
            jpqlQuery.append(from.getNumOfFloors());
            jpqlQuery.append(" and b.numOfFloors <= ");
            jpqlQuery.append(to.getNumOfFloors());
        }
        if (from.getNumOfRooms() != 0 && to.getNumOfRooms() > from.getNumOfRooms()) {
            jpqlQuery.append(" and b.numOfRooms >= ");
            jpqlQuery.append(from.getNumOfRooms());
            jpqlQuery.append(" and b.numOfRooms <= ");
            jpqlQuery.append(to.getNumOfRooms());
        }
        if (from.getNumOfBaths() != 0 && to.getNumOfBaths() > from.getNumOfBaths()) {
            jpqlQuery.append(" and b.numOfBaths >= ");
            jpqlQuery.append(from.getNumOfBaths());
            jpqlQuery.append(" and b.numOfBaths <= ");
            jpqlQuery.append(to.getNumOfBaths());
        }
        if (from.getLivingArea() != 0 && to.getLivingArea() > from.getLivingArea()) {
            jpqlQuery.append(" and b.livingArea >= ");
            jpqlQuery.append(from.getLivingArea());
            jpqlQuery.append(" and b.livingArea <= ");
            jpqlQuery.append(to.getLivingArea());
        }
        if (from.getTotalArea() != 0 && to.getTotalArea() > from.getTotalArea()) {
            jpqlQuery.append(" and b.totalArea >= ");
            jpqlQuery.append(from.getTotalArea());
            jpqlQuery.append(" and b.totalArea <= ");
            jpqlQuery.append(to.getTotalArea());
        }
        if (from.getCourtArea() != 0 && to.getCourtArea() > from.getCourtArea()) {
            jpqlQuery.append(" and b.courtArea >= ");
            jpqlQuery.append(from.getCourtArea());
            jpqlQuery.append(" and b.courtArea <= ");
            jpqlQuery.append(to.getCourtArea());
        }
        if (from.getDistanceToMetro() != 0 && to.getDistanceToMetro() > from.getDistanceToMetro()) {
            jpqlQuery.append(" and b.distanceToMetro >= ");
            jpqlQuery.append(from.getDistanceToMetro());
            jpqlQuery.append(" and b.distanceToMetro <= ");
            jpqlQuery.append(to.getDistanceToMetro());
        }
        Query query = em.createQuery(jpqlQuery.toString());
        return query.getResultList();
    }
}
