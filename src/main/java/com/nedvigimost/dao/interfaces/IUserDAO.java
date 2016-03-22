package com.nedvigimost.dao.interfaces;

import com.nedvigimost.vo.User;
import org.hibernate.stat.Statistics;

/**
 * Created by Alexis on 20.03.2016.
 */
public interface IUserDAO {
    public void addUser(User user);
    public User getUserById(int id);
    public void saveUser(User user);
    public void removeUser(User user);
}
