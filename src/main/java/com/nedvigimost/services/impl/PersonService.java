package com.nedvigimost.services.impl;

import com.nedvigimost.dao.interfaces.IBuildingDAO;
import com.nedvigimost.dao.interfaces.IPersonDAO;
import com.nedvigimost.services.interfaces.PersonServiceInterface;
import com.nedvigimost.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alexis on 20.03.2016.
 */
@Transactional
public class PersonService implements PersonServiceInterface{
    @Autowired
    private IPersonDAO personDAO;

    public Person getById(int id) {
        return null;
    }

    public Person addPerson(Person person) {
        return null;
    }

    public void editPerson(Person person) {

    }

    public void removePerson(Person person) {

    }

    public List<Person> getAllPeople() {
        return null;
    }
}
