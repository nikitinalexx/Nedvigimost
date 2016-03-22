package com.nedvigimost.vo;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by ������� on 14.02.2016.
 */
@Entity
@Component
@Table(name="photos")
public class Photo {
    @Id
    @GeneratedValue
    private int idPhoto;

    @NotNull
    @OneToOne
    @JoinColumn(name = "building_id", nullable = false)
    private Building building;

    @NotNull
    @Size(min=1, max=255)
    @Column(name="path", nullable = false)
    private String path;

    public Photo() {}

    public Photo(String path, Building building) {
        this.path = path;
        this.building = building;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getIdPhoto() {
        return idPhoto;
    }

    public void setIdPhoto(int idPhoto) {
        this.idPhoto = idPhoto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Photo)) return false;

        Photo photo = (Photo) o;

        if (idPhoto != photo.idPhoto) return false;
        if (!building.equals(photo.building)) return false;
        if (!path.equals(photo.path)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPhoto;
        result = 31 * result + building.hashCode();
        result = 31 * result + path.hashCode();
        return result;
    }
}
