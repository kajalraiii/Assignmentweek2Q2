package com.example.demo2.service;


import com.example.demo2.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class ServiceLayer {
    private final RestTemplate restTemplate;
    @Autowired
    public ServiceLayer(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public Employee consumeAPI(){
        return restTemplate.getForObject( "http://dummy.restapiexample.com/api/v1/employee/1",Employee.class);
    }
}

