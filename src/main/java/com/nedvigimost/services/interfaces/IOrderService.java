package com.nedvigimost.services.interfaces;

import com.nedvigimost.vo.Building;
import com.nedvigimost.vo.Order;
import com.nedvigimost.vo.WaitingHistory;

import java.util.List;

/**
 * Created by ������� on 14.02.2016.
 */
public interface IOrderService {
    public Order getById(int id);
    public void addOrder(Order order);
    public void editOrder(Order order);
    public void removeOrder(Order order);
    public List<Order> getBuildingOrders(Building building);
    public Order processWaitingHistory(WaitingHistory waitingHistory);
}
