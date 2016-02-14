package com.nedvigimost.vo;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Алексей on 14.02.2016.
 */
@Component
public class User {
    private int idUser;
    @Min(1)
    @Max(2)
    private int role;
    @NotNull
    @Size(min=1, max=255)
    private String firstName;
    @NotNull
    @Size(min=1, max=255)
    private String secondName;
    @NotNull
    @Size(min=1, max=255)
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
}
