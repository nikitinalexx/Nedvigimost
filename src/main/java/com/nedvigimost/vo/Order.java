package com.nedvigimost.vo;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import java.util.Calendar;

/**
 * Created by ������� on 14.02.2016.
 */
@Entity
@Component
public class Order {

    private int idOrder;
    @Min(1) @Max(2)
    private int type;  // 1 is for selling
    @Min(0)
    private int idBuilding;
    @Min(0)
    private int idOwner;
    @Min(0)
    private int idClient;
    @Min(0)
    private int price;


    public Order() {
    }

    public Order(int type, int idBuilding, int idOwner, int idClient, Calendar startDate, Calendar endDate, int price) {
        this.type = type;
        this.idBuilding = idBuilding;
        this.idOwner = idOwner;
        this.idClient = idClient;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }

    @Past
    private Calendar startDate;

    public Order(int idOrder, int type, int idBuilding, int idOwner, int idClient, Calendar startDate, Calendar endDate, int price) {
        this.idOrder = idOrder;
        this.type = type;
        this.idBuilding = idBuilding;
        this.idOwner = idOwner;
        this.idClient = idClient;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
    }

    @Past
    private Calendar endDate;





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

    public int getIdBuilding() {
        return idBuilding;
    }

    public void setIdBuilding(int idBuilding) {
        this.idBuilding = idBuilding;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
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
