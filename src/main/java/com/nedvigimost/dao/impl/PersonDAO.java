package com.nedvigimost.dao.impl;

import com.nedvigimost.dao.interfaces.IPersonDAO;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Alexis on 20.03.2016.
 */
@Repository
public class PersonDAO implements IPersonDAO{
    @Autowired
    private SessionFactory sessionFactory;
}