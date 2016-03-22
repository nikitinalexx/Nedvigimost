package com.nedvigimost.vo;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by ������� on 14.02.2016.
 */
@Entity
@Component
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    private int idUser;

    @Min(1)
    @Max(2)
    @Column(name="role", nullable = false)
    private int role;
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

    public User() {}

    public User(int role, String firstName, String secondName, String middleName) {
        this.role = role;
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (idUser != user.idUser) return false;
        if (role != user.role) return false;
        if (!firstName.equals(user.firstName)) return false;
        if (!middleName.equals(user.middleName)) return false;
        if (!secondName.equals(user.secondName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUser;
        result = 31 * result + role;
        result = 31 * result + firstName.hashCode();
        result = 31 * result + secondName.hashCode();
        result = 31 * result + middleName.hashCode();
        return result;
    }
}
