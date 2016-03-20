package com.nedvigimost.dao.impl;

import com.nedvigimost.dao.interfaces.IPhotoDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Alexis on 20.03.2016.
 */
@Repository
public class PhotoDAO implements IPhotoDAO{
    @Autowired
    private SessionFactory sessionFactory;
}
