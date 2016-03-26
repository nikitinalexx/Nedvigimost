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
@NamedQueries(
        @NamedQuery(name = "getSoldOrRentedBuildings", query =
                "select b\n" +
                        "  from Building b\n" +
                        " where b not in (select history.building\n" +
                        "                   from WaitingHistory history\n" +
                        "                  where history.endDate > :currentDate)\n" +
                        "   and b not in (select o.building\n" +
                        "                   from Order o\n" +
                        "                  where type = 2\n" +
                        "                    and o.endDate > :currentDate)\n" +
                        "   and b in (select o.building from Order o where o.type = 1)\n" +
                        "union\n" +
                        "select o.building\n" +
                        "  from Order o\n" +
                        " where o.type = 2\n" +
                        "   and o.endDate > :currentDate")
)
public class Building {
    @Id
    @GeneratedValue
    private int idBuilding;

    @NotNull
    @ManyToOne
    private Person owner;

    @Min(1)
    @Column(name="num_of_floors", nullable=false)
    private int numOfFloors;
    @Min(1)
    @Column(name="num_of_rooms", nullable=false)
    private int numOfRooms;
    @Min(1)
    @Column(name="num_of_baths", nullable=false)
    private int numOfBaths;
    @Min(0)
    @Column(name="living_area", nullable=false)
    private double livingArea;
    @Min(0)
    @Column(name="total_area", nullable=false)
    private double totalArea;
    @Min(0)
    @Column(name="court_area", nullable=false)
    private double courtArea;
    @Min(0)
    @Column(name="distance_to_metro", nullable=false)
    private double distanceToMetro;
    @NotNull @Size(min=1, max=255)
    @Column(name="address", nullable=false)
    private String address;
    @NotNull
    @Column(name="animals_allowed", nullable=false)
    private Boolean animalsAllowed;
    @Column(name="notes")
    private String notes;



    public void setIdBuilding(int idBuilding) {
        this.idBuilding = idBuilding;
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

    public Building(int numOfFloors, int numOfRooms, int numOfBaths, double livingArea, double totalArea, double courtArea, double distanceToMetro, String address, Boolean animalsAllowed, String notes, Person owner) {
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

    public Building(int numOfFloors, int numOfRooms, int numOfBaths, double livingArea, double totalArea, double courtArea, double distanceToMetro, String address, Boolean animalsAllowed, String notes) {
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
    }

    public int getIdBuilding() {
        return idBuilding;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Building)) return false;

        Building building = (Building) o;

        if (Double.compare(building.courtArea, courtArea) != 0) return false;
        if (Double.compare(building.distanceToMetro, distanceToMetro) != 0) return false;
        if (idBuilding != building.idBuilding) return false;
        if (Double.compare(building.livingArea, livingArea) != 0) return false;
        if (numOfBaths != building.numOfBaths) return false;
        if (numOfFloors != building.numOfFloors) return false;
        if (numOfRooms != building.numOfRooms) return false;
        if (Double.compare(building.totalArea, totalArea) != 0) return false;
        if (!address.equals(building.address)) return false;
        if (!animalsAllowed.equals(building.animalsAllowed)) return false;
        if (notes != null ? !notes.equals(building.notes) : building.notes != null) return false;
        if (!owner.equals(building.owner)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idBuilding;
        result = 31 * result + owner.hashCode();
        result = 31 * result + numOfFloors;
        result = 31 * result + numOfRooms;
        result = 31 * result + numOfBaths;
        temp = Double.doubleToLongBits(livingArea);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(totalArea);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(courtArea);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(distanceToMetro);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + address.hashCode();
        result = 31 * result + animalsAllowed.hashCode();
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        return result;
    }
}
