package com.nedvigimost.services.interfaces;

import com.nedvigimost.vo.Building;

import java.util.List;

/**
 * Created by ������� on 14.02.2016.
 */
public interface IBuildingService {
    public Building getById(int id);
    public Building addBuilding(Building building);
    public void editBuilding(Building building);
    public void removeBuilding(Building building);

    public List<Building> getSoldOrRentedBuildings();
    public List<Building> getBuildingsLike(Building building);
}
