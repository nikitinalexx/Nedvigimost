package com.nedvigimost.vo;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by ������� on 14.02.2016.
 */
@Entity
@Component
public class Photo {
    private int id;
    @NotNull
    @Size(min=1, max=255)
    private String path;
    @Min(0)
    private int idBuilding;

    public Photo() {}

    public Photo(String path, int idBuilding) {
        this.path = path;
        this.idBuilding = idBuilding;
    }

    public int getIdBuilding() {
        return idBuilding;
    }

    public void setIdBuilding(int idBuilding) {
        this.idBuilding = idBuilding;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
