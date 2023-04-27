package com.UST.statemapping.Service;

import com.UST.statemapping.Model.State;
import com.UST.statemapping.Repository.Staterepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Stateservice {
    @Autowired
    private Staterepo repo;

    public List<State> getDistricts() {
        return repo.findAll();
    }
    public  State getDistrictByStatename(String statename) {
        return repo.findByStatename(statename);
    }
}
