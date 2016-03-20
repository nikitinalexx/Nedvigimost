package com.nedvigimost.vo;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.util.Calendar;

/**
 * Created by ������� on 14.02.2016.
 */
@Entity
@Component
public class WaitingHistory {
    private int idHistory;
    @Min(0)
    private int idBuilding;

    @NotNull
    @Past
    private Calendar startDate;
    @Past
    private Calendar endDate;
    @Min(0)
    private int priceForSelling;
    @Min(0)
    private int priceForRenting;

    public WaitingHistory() {}

    public WaitingHistory(int idBuilding, Calendar startDate, Calendar endDate, int priceForSelling, int priceForRenting) {
        this.idBuilding = idBuilding;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priceForSelling = priceForSelling;
        this.priceForRenting = priceForRenting;
    }

    public int getIdHistory() {
        return idHistory;
    }

    public void setIdHistory(int idHistory) {
        this.idHistory = idHistory;
    }

    public int getIdBuilding() {
        return idBuilding;
    }

    public void setIdBuilding(int idBuilding) {
        this.idBuilding = idBuilding;
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
}
