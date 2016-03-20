package com.nedvigimost.services.impl;

import com.nedvigimost.services.interfaces.OrderServiceInterface;
import com.nedvigimost.vo.Building;
import com.nedvigimost.vo.Order;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alexis on 20.03.2016.
 */
@Transactional
public class OrderService implements OrderServiceInterface {
    @Override
    public Order getById(int id) {
        return null;
    }

    @Override
    public Order addOrder(Order order) {
        return null;
    }

    @Override
    public void editOrder(Order order) {

    }

    @Override
    public void removeOrder(Order order) {

    }

    @Override
    public List<Order> getBuildingOrders(Building building) {
        return null;
    }
}
