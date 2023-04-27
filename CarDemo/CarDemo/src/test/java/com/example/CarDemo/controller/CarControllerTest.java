package com.example.CarDemo.controller;

import com.example.CarDemo.entity.CarEntity;
import com.example.CarDemo.service.CarService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@ExtendWith(SpringExtension.class)
@WebMvcTest(CarController.class)
class CarControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CarService mockService;

    @Test
    void testAddemps() throws Exception {
        // Setup
        // Configure CarService.addemp(...).
        final CarEntity carEntity = new CarEntity(0, "name", "phno", "emailid", "color", "seat", "date", "status");
        when(mockService.addemp(
                new CarEntity(0, "name", "phno", "emailid", "color", "seat", "date", "status"))).thenReturn(carEntity);

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(post("/sharathcars/add")
                        .content(asJsonString(carEntity)).contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
       // assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
    }

    private String asJsonString(CarEntity carEntity) {

            try{
                return new ObjectMapper().writeValueAsString(carEntity);
            }
            catch(JsonProcessingException e){
                e.printStackTrace();
            }
            return null;
        }


    @Test
    void testGetAlls() throws Exception {
        // Setup
        // Configure CarService.getAll(...).
        final List<CarEntity> carEntities = List.of(
                new CarEntity(0, "name", "phno", "emailid", "color", "seat", "date", "status"));
        when(mockService.getAll()).thenReturn(carEntities);

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/sharathcars/c")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        //assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
    }

    @Test
    void testGetAlls_CarServiceReturnsNoItems() throws Exception {
        // Setup
        when(mockService.getAll()).thenReturn(Collections.emptyList());

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/sharathcars/c")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        //assertThat(response.getContentAsString()).isEqualTo("[]");
    }

    @Test
    void testGetByIds() throws Exception {
        // Setup
        when(mockService.getAllbydate("date")).thenReturn(List.of());

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/sharathcars/{date}", "date")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
       // assertThat(response.getContentAsString()).isEqualTo("expectedResponse");
    }

    @Test
    void testGetByIds_CarServiceReturnsNoItems() throws Exception {
        // Setup
        when(mockService.getAllbydate("date")).thenReturn(Collections.emptyList());

        // Run the test
        final MockHttpServletResponse response = mockMvc.perform(get("/sharathcars/{date}", "date")
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn().getResponse();

        // Verify the results
        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
        assertThat(response.getContentAsString()).isEqualTo("[]");
    }
}
