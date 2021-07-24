package com.example.restapi;

import org.springframework.stereotype.Component;

@Component // component ตัวนี้ Spring boot ตอน Initial จะสร้าง Instance ให้ 1 class 1 interface จะมีแค่ 1 = Singleton
public class GenerateIdService
{
    public int counter;
    public String getId(){
        return "XYZ7";
    }
}
