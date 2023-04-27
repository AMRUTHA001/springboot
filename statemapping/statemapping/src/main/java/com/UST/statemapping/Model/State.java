package com.UST.statemapping.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class State {
        @Id
        private int Id;
        private String statename;
        private String districtname;


}
