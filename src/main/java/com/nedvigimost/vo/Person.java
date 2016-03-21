package com.nedvigimost.vo;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by ������� on 14.02.2016.
 */
@Entity
@Component
@Table(name="people")
public class Person {
    @Id
    @GeneratedValue
    private int idPerson;

    @NotNull
    @Size(min=1, max=255)
    @Column(name="first_name")
    private String firstName;
    @NotNull
    @Size(min=1, max=255)
    @Column(name="second_name")
    private String secondName;
    @NotNull
    @Size(min=1, max=255)
    @Column(name="middle_name")
    private String middleName;
    @NotNull
    @Size(min=1, max=255)
    @Column(name="phone_number")
    private String phoneNumber;

    public Person() {}

    public Person(String firstName, String secondName, String middleName, String phoneNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.phoneNumber = phoneNumber;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
