package com.UST.statemapping.Repository;

import com.UST.statemapping.Model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Staterepo extends JpaRepository<State,Integer> {


    State findByStatename(String statename);
}
