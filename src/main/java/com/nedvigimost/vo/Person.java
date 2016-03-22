package com.nedvigimost.vo;

import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

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

    @OneToMany(fetch = FetchType.LAZY, mappedBy="owner", cascade = javax.persistence.CascadeType.ALL)
    private List<Building> buildings;

    @NotNull
    @Size(min=1, max=255)
    @Column(name="first_name", nullable = false)
    private String firstName;
    @NotNull
    @Size(min=1, max=255)
    @Column(name="second_name", nullable = false)
    private String secondName;
    @NotNull
    @Size(min=1, max=255)
    @Column(name="middle_name", nullable = false)
    private String middleName;
    @NotNull
    @Size(min=1, max=255)
    @Column(name="phone_number", nullable = false)
    private String phoneNumber;

    public Person() {}

    public Person(List<Building> buildings, String firstName, String secondName, String middleName, String phoneNumber) {
        this.buildings = buildings;
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.phoneNumber = phoneNumber;
    }

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

    public List<Building> getBuildings() { return buildings; }

    public void setBuildings(List<Building> buildings) { this.buildings = buildings; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (buildings == null) {
            if (person.buildings != null) {
                return false;
            }
        } else {
            if (person.buildings == null) {
                return false;
            }
        }

        if (buildings != null && person.buildings != null) {
            if (buildings.size() != person.buildings.size()) {
                return false;
            }
            for (int i = 0; i < buildings.size(); i++) {
                if (buildings.get(i).getIdBuilding() != person.buildings.get(i).getIdBuilding()) {
                    return false;
                }
            }
        }

        if (idPerson != person.idPerson) return false;
        if (!firstName.equals(person.firstName)) return false;
        if (!middleName.equals(person.middleName)) return false;
        if (!phoneNumber.equals(person.phoneNumber)) return false;
        if (!secondName.equals(person.secondName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPerson;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + secondName.hashCode();
        result = 31 * result + middleName.hashCode();
        result = 31 * result + phoneNumber.hashCode();
        return result;
    }
}
