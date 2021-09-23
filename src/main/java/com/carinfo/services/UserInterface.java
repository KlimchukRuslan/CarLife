package com.carinfo.services;

import com.carinfo.entity.User;

import java.util.List;

public interface UserInterface {
    List<User> getAllUsers();
    User getUserByID(long id);
    boolean deleteUserInDB(long id);
    boolean saveUser(User user);
    boolean updateUserInDB(User user);
}
