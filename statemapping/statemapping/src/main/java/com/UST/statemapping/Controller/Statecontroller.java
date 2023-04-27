package com.UST.statemapping.Controller;

import com.UST.statemapping.Model.State;
import com.UST.statemapping.Service.Stateservice;
import com.sun.xml.bind.v2.runtime.unmarshaller.UnmarshallingContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Statecontroller {
    @Autowired
    private Stateservice stateservice;
    @GetMapping("/state/district")
    public List<State> getAllDistricts(){
        return stateservice.getDistricts();

    }
    @GetMapping("/state/district/{statename}")
    public State getDistrictByState(@PathVariable String statename){
        return stateservice.getDistrictByStatename(statename);
    }


}
