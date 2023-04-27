package com.UST.UstEmpDetailss.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String empId;
    private String empName;
    private String email;
    private String desig;
    private String empMr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public String getEmpMr() {
        return empMr;
    }

    public void setEmpMr(String empMr) {
        this.empMr = empMr;
    }

    public Employee(int id, String empId, String empName, String email, String desig, String empMr) {
        this.id = id;
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.desig = desig;
        this.empMr = empMr;
    }
    public  Employee(){

    }
}
