package com.nedvigimost.services.impl;

import com.nedvigimost.dao.interfaces.IOrderDAO;
import com.nedvigimost.services.interfaces.IOrderService;
import com.nedvigimost.vo.Building;
import com.nedvigimost.vo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

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

    public List<Order> getBuildingOrders(Building building) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
