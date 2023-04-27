package com.example.CarDemo.controller;

import com.example.CarDemo.entity.CarEntity;
import com.example.CarDemo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sharathcars")
public class CarController {
    @Autowired
    public CarService service;
    @PostMapping("/add")
    public CarEntity addemps(@RequestBody CarEntity car) {
        return service.addemp(car);
    }
    @GetMapping("/c")
    public List<CarEntity> getAlls(){
        return service.getAll();
    }



    @GetMapping("/{date}")
    public List  getByIds(@PathVariable String date){
        return service.getAllbydate(date);
    }
}
