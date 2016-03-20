package com.nedvigimost.services.impl;

import com.nedvigimost.services.interfaces.WaitingHistoryServiceInterface;
import com.nedvigimost.vo.Building;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alexis on 20.03.2016.
 */
@Transactional
public class WaitingHistoryService implements WaitingHistoryServiceInterface {
    @Override
    public com.nedvigimost.vo.WaitingHistory getById(int id) {
        return null;
    }

    @Override
    public com.nedvigimost.vo.WaitingHistory addWaitingHistory(com.nedvigimost.vo.WaitingHistory waitingHistory) {
        return null;
    }

    @Override
    public void editWaitingHistory(com.nedvigimost.vo.WaitingHistory waitingHistory) {

    }

    @Override
    public void removeWaitingHistory(com.nedvigimost.vo.WaitingHistory waitingHistory) {

    }

    @Override
    public List<com.nedvigimost.vo.WaitingHistory> getWaitingHistoryForBuilding(Building building) {
        return null;
    }
}
