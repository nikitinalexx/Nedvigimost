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

/**
 * Created by Alexis on 20.03.2016.
 */
@Repository
public class HibernatePhotoDAO implements IPhotoDAO{
    @Autowired
    private SessionFactory sessionFactory;

    private Session currentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void addPhoto(Photo photo) {
        Session session = currentSession();
        Transaction tx = session.beginTransaction();
        int id = (Integer) session.save(photo);
        photo.setIdPhoto(id);
        session.flush();
    }

    @Override
    public Photo getPhotoById(int id) {
        return (Photo) currentSession().get(Photo.class, id);
    }

    @Override
    public void savePhoto(Photo photo) {
        Session session = currentSession();
        Transaction tx = session.beginTransaction();
        session.update(photo);
        session.flush();
    }

    @Override
    public void removePhoto(Photo photo) {
        Session session = currentSession();
        Transaction tx = session.beginTransaction();
        session.delete(photo);
        session.flush();
    }
}
