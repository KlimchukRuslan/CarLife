package com.carinfo.services;

import com.carinfo.entity.Role;
import com.carinfo.entity.User;
import com.carinfo.repos.UserRepo;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService implements UserInterface {

    final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public boolean saveUser(User user){
        user.setRoles(Collections.singleton(new Role(1L,"EMPLOYEE")));
        userRepo.save(user);
        return true;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public boolean deleteUserInDB(long id) {
        if (userRepo.findById(id).isPresent()){
            userRepo.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateUserInDB(User user) {
        if (userRepo.findById(user.getId()).isPresent()){
            User user_from_db = userRepo.getById(user.getId());
            userRepo.save(user_from_db);
            return true;
        }
        return false;
    }

    @Override
    public User getUserByID(long id) {
        return userRepo.getById(id);
    }
}
