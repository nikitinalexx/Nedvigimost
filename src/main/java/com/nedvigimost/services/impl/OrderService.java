package com.nedvigimost.services.impl;

import com.nedvigimost.dao.interfaces.IOrderDAO;
import com.nedvigimost.services.interfaces.IOrderService;
import com.nedvigimost.vo.Building;
import com.nedvigimost.vo.Order;
import com.nedvigimost.vo.Person;
import com.nedvigimost.vo.WaitingHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Calendar;
import java.util.List;

/**
 * Created by Alexis on 20.03.2016.
 */
@Transactional
public class OrderService implements IOrderService {
    @Autowired
    private IOrderDAO orderDAO;

    public Order getById(int id) {
        return orderDAO.getOrderById(id);
    }

    public void addOrder(Order order) {
        orderDAO.addOrder(order);
    }

    public void editOrder(Order order) {
        orderDAO.saveOrder(order);
    }

    public void removeOrder(Order order) {
        orderDAO.removeOrder(order);
    }

    /**
     * Method returns all completed deals when Building was sold/rented.
     * @param building
     * @return
     */
    public List<Order> getBuildingOrders(Building building) {
        return orderDAO.getBuildingOrders(building);
    }

    /**
     * These method is used to Complete a deal for selling/renting a house.
     * WaitingHistory will be removed and Order will be created to track which house, by who and to who was sold/rented.
     * @param waitingHistory
     * @return
     */
    public Order processWaitingHistory(WaitingHistory waitingHistory, Person client, Calendar startDate, Calendar endDate) {
        return orderDAO.processWaitingHistory(waitingHistory, client, startDate, endDate);
    }
}
