package com.example.CarDemo.service;

import com.example.CarDemo.entity.CarEntity;
import com.example.CarDemo.repo.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarService {
    @Autowired
    private CarRepo repo;
    public CarEntity addemp(CarEntity car) {
        return repo.save(car);
    }

    public List<CarEntity> getAll() {
        return repo.findAll();
    }



    public List<CarEntity> getAll(String date) {
        return repo.findAll();

    }

    public List getAllbydate(String date) {
        return repo.findBydate(date);
    }
}
