package com.nedvigimost.dao.interfaces;

import com.nedvigimost.vo.Person;

/**
 * Created by Alexis on 20.03.2016.
 */
public interface IPersonDAO {
    public void addPerson(Person person);
    public Person getPersonById(int id);
    public void savePerson(Person person);
    public void removePerson(Person person);
}
