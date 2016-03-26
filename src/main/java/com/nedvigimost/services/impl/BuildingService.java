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
        return buildingDAO.getBuildingById(id);
    }

    public void addBuilding(Building building) {
        buildingDAO.addBuilding(building);
    }

    public void editBuilding(Building building) {
        buildingDAO.saveBuilding(building);
    }

    public void removeBuilding(Building building) {
        buildingDAO.removeBuilding(building);
    }

    public List<Building> getSoldOrRentedBuildings() {
        return buildingDAO.getSoldOrRentedBuildings();
    }

    public List<Building> getBuildingsLike(Building from, Building to) {
        return buildingDAO.getBuildingsLike(from, to);
    }
}
