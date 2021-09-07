package com.carinfo.controller;

import com.carinfo.domain.Car;
import com.carinfo.repo.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Базовый контролер для приложения
@RestController
@RequestMapping("/")
public class MainController {

    private final CarRepo carRepo;

    @Autowired
    public MainController(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    @GetMapping
    public List<Car> list(){
        return carRepo.findAll();
    }
}
