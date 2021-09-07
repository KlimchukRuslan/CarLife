package com.carinfo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Базовый контролер для приложения
@RestController
@RequestMapping("/")
public class MainController {
//    Создаем данные для проверки
    public List<Map<String, String>> data = new ArrayList<Map<String, String>>(){{
        add(new HashMap<String,String>() {{ put("id", "1"); put("text", "Главная страница приложения");}});
    }};

//    Мапинг в котором возвращаем данные
    @GetMapping
    public List<Map<String, String>> list(){
        return data;
    }

}
