package com.nedvigimost.dao.interfaces;

import com.nedvigimost.vo.Building;
import com.nedvigimost.vo.User;
import com.nedvigimost.vo.WaitingHistory;

import java.util.List;

/**
 * Created by Alexis on 20.03.2016.
 */
public interface IWaitingHistoryDAO {
    public void addWaitingHistory(WaitingHistory waitingHistory);
    public WaitingHistory getWaitingHistoryById(int id);
    public void saveWaitingHistory(WaitingHistory waitingHistory);
    public void removeWaitingHistory(WaitingHistory waitingHistory);
    public List<WaitingHistory> getWaitingHistoryForBuilding(Building building);
}
