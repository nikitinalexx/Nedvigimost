package com.nedvigimost.services.interfaces;

import com.nedvigimost.vo.Person;

import java.util.List;

/**
 * Created by ������� on 14.02.2016.
 */
public interface IPersonService {
    public Person getById(int id);
    public void addPerson(Person person);
    public void editPerson(Person person);
    public void removePerson(Person person);

    public List<Person> getAllPeople();
}
