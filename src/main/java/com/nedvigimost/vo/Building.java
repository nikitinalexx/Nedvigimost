package com.nedvigimost.vo;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.*;

/**
 * Created by ������� on 14.02.2016.
 */
@Entity
@Component
@Table(name="buildings")
public class Building {
    @Id
    @GeneratedValue
    private int idBuilding;

    @NotNull
    private Person owner;

    @Min(1) @Max(2)
    @Column(name="type")
    private int type; // 1 is for selling
    @Min(1)
    @Column(name="num_of_floors")
    private int numOfFloors;
    @Min(1)
    @Column(name="num_of_rooms")
    private int numOfRooms;
    @Min(1)
    @Column(name="num_of_baths")
    private int numOfBaths;
    @Min(0)
    @Column(name="living_area")
    private double livingArea;
    @Min(0)
    @Column(name="total_area")
    private double totalArea;
    @Min(0)
    @Column(name="court_area")
    private double courtArea;
    @Min(0)
    @Column(name="distance_to_metro")
    private double distanceToMetro;
    @NotNull @Size(min=1, max=255)
    @Column(name="address")
    private String address;
    @Column(name="animals_allowed")
    private Boolean animalsAllowed;
    @Column(name="notes")
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

    public void setNumOfBuths(int numOfBaths) {
        this.numOfBaths = numOfBaths;
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
        this.animalsAllowed = animalsAllowed;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }


    public Building() {
    }

    public Building(int type, int numOfFloors, int numOfRooms, int numOfBuths, double livingArea, double totalArea, double courtArea, double distanceToMetro, String address, Boolean animalsAllowed, String notes, Person owner) {
        this.type = type;
        this.numOfFloors = numOfFloors;
        this.numOfRooms = numOfRooms;
        this.numOfBaths = numOfBaths;
        this.livingArea = livingArea;
        this.totalArea = totalArea;
        this.courtArea = courtArea;
        this.distanceToMetro = distanceToMetro;
        this.address = address;
        this.animalsAllowed = animalsAllowed;
        this.notes = notes;
        this.owner = owner;
    }

    public Building(int idBuilding, int type, int numOfFloors, int numOfRooms, int numOfBaths, double livingArea, double totalArea, double courtArea, double distanceToMetro, String address, Boolean animalsAllowed, String notes, Person owner) {
        this.idBuilding = idBuilding;
        this.type = type;
        this.numOfFloors = numOfFloors;
        this.numOfRooms = numOfRooms;
        this.numOfBaths = numOfBaths;
        this.livingArea = livingArea;
        this.totalArea = totalArea;
        this.courtArea = courtArea;
        this.distanceToMetro = distanceToMetro;
        this.address = address;
        this.animalsAllowed = animalsAllowed;
        this.notes = notes;
        this.owner = owner;
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

    public int getNumOfBaths() {
        return numOfBaths;
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
        return animalsAllowed;
    }

    public String getNotes() {
        return notes;
    }

    public Person getOwner() {
        return owner;
    }


}
