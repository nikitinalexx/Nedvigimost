package com.nedvigimost.dao.impl;

import com.nedvigimost.dao.interfaces.IPhotoDAO;
import com.nedvigimost.vo.Person;
import com.nedvigimost.vo.Photo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
public class HibernatePhotoDAO implements IPhotoDAO{
    @PersistenceContext
    private EntityManager em;

    public void addPhoto(Photo photo) {
        em.persist(photo);
    }

    public Photo getPhotoById(int id) {
        return em.find(Photo.class, id);
    }

    public void savePhoto(Photo photo) {
        em.merge(photo);
    }

    public void removePhoto(Photo photo) {
        em.remove(photo);
    }
}
