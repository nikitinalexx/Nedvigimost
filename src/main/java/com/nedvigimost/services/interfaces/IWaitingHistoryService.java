package com.nedvigimost.services.interfaces;

import com.nedvigimost.vo.Building;
import com.nedvigimost.vo.WaitingHistory;

import java.util.List;

/**
 * Created by ������� on 14.02.2016.
 */
public interface IWaitingHistoryService {
    public WaitingHistory getById(int id);
    public void addWaitingHistory(WaitingHistory waitingHistory);
    public void editWaitingHistory(WaitingHistory waitingHistory);
    public void removeWaitingHistory(WaitingHistory waitingHistory);

    public List<WaitingHistory> getWaitingHistoryForBuilding(Building building);
}
