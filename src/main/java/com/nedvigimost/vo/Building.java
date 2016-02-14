package com.nedvigimost.vo;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by ������� on 14.02.2016.
 */
@Component
public class Building {

    private int idBuilding;
    @Min(1) @Max(2)
    private int type; // 1 is for selling
    @Min(1)
    private int numOfFloors;
    @Min(1)
    private int numOfRooms;
    @Min(1)
    private int numOfBuths;
    @Min(0)
    private double livingArea;
    @Min(0)
    private double totalArea;
    @Min(0)
    private double courtArea;
    @Min(0)
    private double distanceToMetro;
    @NotNull @Size(min=1, max=255)
    private String address;
    private Boolean isAnimalsAllowed;
    @NotNull
    private int idOwner;

    private String notes;



    public void setIdBuilding(int idBuilding) {
        this.idBuilding = idBuilding;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public void setNumOfBuths(int numOfBuths) {
        this.numOfBuths = numOfBuths;
    }

    public void setLivingArea(double livingArea) {
        this.livingArea = livingArea;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    public void setCourtArea(double courtArea) {
        this.courtArea = courtArea;
    }

    public void setDistanceToMetro(double distanceToMetro) {
        this.distanceToMetro = distanceToMetro;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAnimalsAllowed(Boolean animalsAllowed) {
        isAnimalsAllowed = animalsAllowed;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }


    public Building() {
    }

    public Building(int type, int numOfFloors, int numOfRooms, int numOfBuths, double livingArea, double totalArea, double courtArea, double distanceToMetro, String address, Boolean isAnimalsAllowed, String notes, int idOwner) {
        this.type = type;
        this.numOfFloors = numOfFloors;
        this.numOfRooms = numOfRooms;
        this.numOfBuths = numOfBuths;
        this.livingArea = livingArea;
        this.totalArea = totalArea;
        this.courtArea = courtArea;
        this.distanceToMetro = distanceToMetro;
        this.address = address;
        this.isAnimalsAllowed = isAnimalsAllowed;
        this.notes = notes;
        this.idOwner = idOwner;
    }

    public Building(int idBuilding, int type, int numOfFloors, int numOfRooms, int numOfBuths, double livingArea, double totalArea, double courtArea, double distanceToMetro, String address, Boolean isAnimalsAllowed, String notes, int idOwner) {
        this.idBuilding = idBuilding;
        this.type = type;
        this.numOfFloors = numOfFloors;
        this.numOfRooms = numOfRooms;
        this.numOfBuths = numOfBuths;
        this.livingArea = livingArea;
        this.totalArea = totalArea;
        this.courtArea = courtArea;
        this.distanceToMetro = distanceToMetro;
        this.address = address;
        this.isAnimalsAllowed = isAnimalsAllowed;
        this.notes = notes;
        this.idOwner = idOwner;
    }

    public int getIdBuilding() {
        return idBuilding;
    }

    public int getType() {
        return type;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public int getNumOfBuths() {
        return numOfBuths;
    }

    public double getLivingArea() {
        return livingArea;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public double getCourtArea() {
        return courtArea;
    }

    public double getDistanceToMetro() {
        return distanceToMetro;
    }

    public String getAddress() {
        return address;
    }

    public Boolean getAnimalsAllowed() {
        return isAnimalsAllowed;
    }

    public String getNotes() {
        return notes;
    }

    public int getIdOwner() {
        return idOwner;
    }


}
