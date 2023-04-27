package com.UST.interviewScheduler.Controller;

import com.UST.interviewScheduler.Model.User;
import com.UST.interviewScheduler.Service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.List;

@RestController
@RequestMapping("/a")
public class Usercontroller {
    @Autowired

    private Userservice service;
    @PostMapping("/addemps")
    public User addEmployee(@RequestBody User user) {

        return service.createuser(user);

    }

    @GetMapping("/b")
    public List<User> getAllEmployees(){
        return service.getUser();
    }

    @GetMapping ("/b/{email}")
    public User getByEmployeeId(@PathVariable String email){
        return service.getUserByEmail(email);
    }




}
