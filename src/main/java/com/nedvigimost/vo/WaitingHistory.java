package com.nedvigimost.vo;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Calendar;

/**
 * Created by ������� on 14.02.2016.
 */
@Entity
@Component
@Table(name="histories")
public class WaitingHistory {
    @Id
    @GeneratedValue
    private int idWaitingHistory;

    @NotNull
    @OneToOne
    @JoinColumn(name = "building_id", nullable = false)
    private Building building;

    @NotNull
    @Past
    @Column(name="start_date")
    private Calendar startDate;
    @Past
    @Column(name="end_date")
    private Calendar endDate;
    @Min(0)
    @Column(name="price_for_selling")
    private int priceForSelling;
    @Min(0)
    @Column(name="price_for_renting")
    private int priceForRenting;

    public WaitingHistory() {}

    public WaitingHistory(Building building, Calendar startDate, Calendar endDate, int priceForSelling, int priceForRenting) {
        this.building = building;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priceForSelling = priceForSelling;
        this.priceForRenting = priceForRenting;
    }

    public int getIdWaitingHistory() {
        return idWaitingHistory;
    }

    public void setIdWaitingHistory(int idWaitingHistory) {
        this.idWaitingHistory = idWaitingHistory;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
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

    public int getPriceForSelling() {
        return priceForSelling;
    }

    public void setPriceForSelling(int priceForSelling) {
        this.priceForSelling = priceForSelling;
    }

    public int getPriceForRenting() {
        return priceForRenting;
    }

    public void setPriceForRenting(int priceForRenting) {
        this.priceForRenting = priceForRenting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WaitingHistory)) return false;

        WaitingHistory that = (WaitingHistory) o;

        if (idWaitingHistory != that.idWaitingHistory) return false;
        if (priceForRenting != that.priceForRenting) return false;
        if (priceForSelling != that.priceForSelling) return false;
        if (!building.equals(that.building)) return false;
        if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) return false;
        if (startDate != null ? !startDate.equals(that.startDate) : that.startDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idWaitingHistory;
        result = 31 * result + building.hashCode();
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + priceForSelling;
        result = 31 * result + priceForRenting;
        return result;
    }
}
