package com.example.CarDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarEntity {
    @Id
    @GeneratedValue

    private  Integer id;
    private  String name;
    private  String phno;
    private  String emailid;
    private  String color;
    private  String seat;
    private  String date;
    private  String status;


}
