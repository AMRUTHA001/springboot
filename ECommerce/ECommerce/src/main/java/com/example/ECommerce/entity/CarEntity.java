package com.example.ECommerce.entity;

import com.example.ECommerce.service.CarService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.security.PublicKey;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CarEntity {
    @Autowired
    public CarService car;
    @Id
    @GeneratedValue
    private Long carId;
    private String carName;
    private String manufacturedYear;
    private List<String> colours;
    private List<String> paymentWays;
    private List<String> cities;
    private List<String> accessories;
    private String model;
    private String price;


}
