package com.example.restapi.number;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //controller
public class IdController
{
    @GetMapping("/id") //ทำ GET
    public DataResponse generateId(){
        return  new DataResponse("XYZ7");
    }
}
