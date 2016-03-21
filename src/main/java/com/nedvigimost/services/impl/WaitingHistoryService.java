package com.nedvigimost.services.impl;

import com.nedvigimost.dao.interfaces.IBuildingDAO;
import com.nedvigimost.dao.interfaces.IWaitingHistoryDAO;
import com.nedvigimost.services.interfaces.WaitingHistoryServiceInterface;
import com.nedvigimost.vo.Building;
import com.nedvigimost.vo.WaitingHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alexis on 20.03.2016.
 */
@Transactional
public class WaitingHistoryService implements WaitingHistoryServiceInterface {
    @Autowired
    private IWaitingHistoryDAO waitingHistoryDAO;

    public WaitingHistory getById(int id) {
        return null;
    }

    public WaitingHistory addWaitingHistory(WaitingHistory waitingHistory) {
        return null;
    }

    public void editWaitingHistory(WaitingHistory waitingHistory) {

    }

    public void removeWaitingHistory(WaitingHistory waitingHistory) {

    }

    public List<WaitingHistory> getWaitingHistoryForBuilding(Building building) {
        return null;
    }
}
