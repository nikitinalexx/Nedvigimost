package com.nedvigimost.services.impl;

import com.nedvigimost.dao.interfaces.IBuildingDAO;
import com.nedvigimost.services.interfaces.IBuildingService;
import com.nedvigimost.vo.Building;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alexis on 20.03.2016.
 */
@Transactional
public class BuildingService implements IBuildingService {
    @Autowired
    private IBuildingDAO buildingDAO;

    public Building getById(int id) {
        return null;
    }

    public Building addBuilding(Building building) {
        return null;
    }

    public void editBuilding(Building building) {

    }

    public void removeBuilding(Building building) {

    }

    public List<Building> getSoldOrRentedBuildings() {
        return null;
    }

    public List<Building> getBuildingsLike(Building building) {
        return null;
    }
}
