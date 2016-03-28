package com.nedvigimost.dao.interfaces;

import com.nedvigimost.vo.Building;
import com.nedvigimost.vo.Person;

import java.util.List;

/**
 * Created by Alexis on 20.03.2016.
 */
public interface IBuildingDAO {
    public void addBuilding(Building building);
    public Building getBuildingById(int id);
    public void saveBuilding(Building building);
    public void removeBuilding(Building building);
    public List<Building> getSoldOrRentedBuildings();
    public List<Building> getBuildingsLike(Building from, Building to);
}
