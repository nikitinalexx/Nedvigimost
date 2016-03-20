package com.nedvigimost.services.impl;

import com.nedvigimost.services.interfaces.BuildingServiceInterface;
import com.nedvigimost.vo.Building;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alexis on 20.03.2016.
 */
@Transactional
public class BuildingService implements BuildingServiceInterface {
    @Override
    public Building getById(int id) {
        return null;
    }

    @Override
    public Building addBuilding(Building building) {
        return null;
    }

    @Override
    public void editBuilding(Building building) {

    }

    @Override
    public void removeBuilding(Building building) {

    }

    @Override
    public List<Building> getSoldOrRentedBuildings() {
        return null;
    }

    @Override
    public List<Building> getBuildingsLike(Building building) {
        return null;
    }
}
