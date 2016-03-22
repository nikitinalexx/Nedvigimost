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
        return null;
    }

    public User addUser(User user) {
        return null;
    }

    public void editUser(User user) {

    }

    public void removeUser(User user) {

    }

    public List<User> getAllUsers() {
        return null;
    }
}
