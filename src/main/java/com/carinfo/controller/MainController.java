package com.carinfo.controller;

import com.carinfo.entity.Car;
import com.carinfo.repos.CarRepo;
import com.carinfo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {

    final UserService userservice;
    final CarRepo carRepo;

    @Autowired
    public MainController(CarRepo carRepo, UserService userservice) {
        this.carRepo = carRepo;
        this.userservice = userservice;
    }

    @GetMapping
    public List<Car> list(){
        return carRepo.findAll();
    }
}
