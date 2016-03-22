package com.nedvigimost.services.impl;

import com.nedvigimost.dao.interfaces.IUserDAO;
import com.nedvigimost.services.interfaces.IUserService;
import com.nedvigimost.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Alexis on 20.03.2016.
 */
@Transactional
public class UserService implements IUserService {
    @Autowired
    private IUserDAO userDAO;

    public User getById(int id) {
        return userDAO.getUserById(id);
    }

    public void addUser(User user) {
        userDAO.addUser(user);
    }

    public void editUser(User user) {
        userDAO.saveUser(user);
    }

    public void removeUser(User user) {
        userDAO.removeUser(user);
    }

    public List<User> getAllUsers() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
