package com.nedvigimost.dao.interfaces;

import com.nedvigimost.vo.Building;
import com.nedvigimost.vo.Order;

/**
 * Created by Alexis on 20.03.2016.
*/
public interface IOrderDAO {
    public void addOrder(Order order);
    public Order getOrderById(int id);
    public void saveOrder(Order order);
    public void removeOrder(Order order);
}
