package com.UST.interviewScheduler.Service;

import com.UST.interviewScheduler.Model.User;
import com.UST.interviewScheduler.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;

@Service
public class Userservice {
    @Autowired
    private Repo repo;
    public User createuser(User user) {
        return repo.save(user);

    }

    public List<User> getUser() {
        return repo.findAll();

    }


    public User getUserByEmail(String email) {
        return repo.findByEmail(email).orElse(null);
    }
}
