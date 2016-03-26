package com.nedvigimost.services.impl;

import com.nedvigimost.dao.interfaces.IPersonDAO;
import com.nedvigimost.services.interfaces.IPersonService;
import com.nedvigimost.vo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alexis on 20.03.2016.
 */
@Transactional
public class PersonService implements IPersonService {
    @Autowired
    private IPersonDAO personDAO;

    public Person getById(int id) {
        return personDAO.getPersonById(id);
    }

    public void addPerson(Person person) {
        personDAO.addPerson(person);
    }

    public void editPerson(Person person) {
        personDAO.savePerson(person);
    }

    public void removePerson(Person person) {
        personDAO.removePerson(person);
    }

    public List<Person> getAllPeople() {
        return personDAO.getAllPeople();
    }
}
