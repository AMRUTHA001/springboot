package com.UST.interviewScheduler.Repository;

import com.UST.interviewScheduler.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Repo extends JpaRepository<User,Integer> {

    Optional<User> findByEmail(String email);
}
