package com.nedvigimost.services.impl;

import com.nedvigimost.dao.interfaces.IWaitingHistoryDAO;
import com.nedvigimost.services.interfaces.IWaitingHistoryService;
import com.nedvigimost.vo.Building;
import com.nedvigimost.vo.WaitingHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alexis on 20.03.2016.
 */
@Transactional
public class WaitingHistoryService implements IWaitingHistoryService {
    @Autowired
    private IWaitingHistoryDAO waitingHistoryDAO;

    public WaitingHistory getById(int id) {
        return waitingHistoryDAO.getWaitingHistoryById(id);
    }

    public void addWaitingHistory(WaitingHistory waitingHistory) {
        waitingHistoryDAO.addWaitingHistory(waitingHistory);
    }

    public void editWaitingHistory(WaitingHistory waitingHistory) {
        waitingHistoryDAO.saveWaitingHistory(waitingHistory);
    }

    public void removeWaitingHistory(WaitingHistory waitingHistory) {
        waitingHistoryDAO.removeWaitingHistory(waitingHistory);
    }

    public List<WaitingHistory> getWaitingHistoryForBuilding(Building building) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
