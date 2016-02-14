package com.nedvigimost.services.interfaces;

import com.nedvigimost.vo.Building;
import com.nedvigimost.vo.WaitingHistory;

import java.util.List;

/**
 * Created by Алексей on 14.02.2016.
 */
public interface WaitingHistoryServiceInterface {
    public WaitingHistory getById(int id);
    public WaitingHistory addWaitingHistory(WaitingHistory waitingHistory);
    public void editWaitingHistory(WaitingHistory waitingHistory);
    public void removeWaitingHistory(WaitingHistory waitingHistory);

    public List<WaitingHistory> getWaitingHistoryForBuilding(Building building);
}
