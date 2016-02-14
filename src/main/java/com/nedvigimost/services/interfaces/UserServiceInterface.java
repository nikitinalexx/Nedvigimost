package com.nedvigimost.services.interfaces;

import com.nedvigimost.vo.User;

import java.util.List;

/**
 * Created by Алексей on 14.02.2016.
 */
public interface UserServiceInterface {
    public User getById(int id);
    public User addUser(User user);
    public void editUser(User user);
    public void removeUser(User user);

    public List<User> getAllUsers();
}
