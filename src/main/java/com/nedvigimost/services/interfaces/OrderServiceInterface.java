package com.nedvigimost.services.interfaces;

import com.nedvigimost.vo.Building;
import com.nedvigimost.vo.Order;

import java.util.List;

/**
 * Created by Алексей on 14.02.2016.
 */
public interface OrderServiceInterface {
    public Order getById(int id);
    public Order addOrder(Order order);
    public void editOrder(Order order);
    public void removeOrder(Order order);

    public List<Order> getBuildingOrders(Building building);
}
