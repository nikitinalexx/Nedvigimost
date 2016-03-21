package com.nedvigimost.vo;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Calendar;

/**
 * Created by ������� on 14.02.2016.
 */
@Entity
@Component
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue
    private int idOrder;

    @NotNull
    private Building building;
    @NotNull
    private Person owner;
    @NotNull
    private Person client;

    @Min(1) @Max(2)
    @Column(name="type")
    private int type;  // 1 is for selling
    @Min(0)
    @Column(name="price")
    private int price;
    @Past
    @Column(name="start_date")
    private Calendar startDate;
    @Past
    @Column(name="end_date")
    private Calendar endDate;

    public Order() {
    }

    public Order(int type, Building building, Person owner, Person client, Calendar startDate, Calendar endDate, int price) {
        this.type = type;
        this.building = building;
        this.owner = owner;
        this.client = client;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }

    public Order(int idOrder, int type, Building building, Person owner, Person client, Calendar startDate, Calendar endDate, int price) {
        this.idOrder = idOrder;
        this.type = type;
        this.building = building;
        this.owner = owner;
        this.client = client;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Person getClient() {
        return client;
    }

    public void setClient(Person client) {
        this.client = client;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

}
