package com.nedvigimost.dao.interfaces;

import com.nedvigimost.vo.Building;
import com.nedvigimost.vo.Order;
import com.nedvigimost.vo.Person;
import com.nedvigimost.vo.WaitingHistory;

import java.util.Calendar;
import java.util.List;

/**
 * Created by Alexis on 20.03.2016.
 */
public interface IOrderDAO {
    public void addOrder(Order order);
    public Order getOrderById(int id);
    public void saveOrder(Order order);
    public void removeOrder(Order order);
    public List<Order> getBuildingOrders(Building building);
    public Order processWaitingHistory(WaitingHistory waitingHistory, Person client, Calendar startDate, Calendar endDate);
}
