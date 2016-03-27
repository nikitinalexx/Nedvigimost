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
@NamedQueries(
        @NamedQuery(name = "getBuildingOrders", query = "select o from Order o where o.building = ?")
)
public class Order {
    @Id
    @GeneratedValue
    private int idOrder;

    @NotNull
    @OneToOne
    @JoinColumn(name = "building_id", nullable = false)
    private Building building;
    @NotNull
    @OneToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private Person owner;
    @NotNull
    @OneToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Person client;

    @Min(1) @Max(2)
    @Column(name="type", nullable = false)
    private int type;  // 1 is for selling
    @Min(0)
    @Column(name="price", nullable = false)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;

        Order order = (Order) o;

        if (idOrder != order.idOrder) return false;
        if (price != order.price) return false;
        if (type != order.type) return false;
        if (!building.equals(order.building)) return false;
        if (!client.equals(order.client)) return false;
        if (endDate != null ? !endDate.equals(order.endDate) : order.endDate != null) return false;
        if (!owner.equals(order.owner)) return false;
        if (startDate != null ? !startDate.equals(order.startDate) : order.startDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idOrder;
        result = 31 * result + building.hashCode();
        result = 31 * result + owner.hashCode();
        result = 31 * result + client.hashCode();
        result = 31 * result + type;
        result = 31 * result + price;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        return result;
    }
}
