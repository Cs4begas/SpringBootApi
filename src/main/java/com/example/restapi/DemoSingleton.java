package com.example.restapi;

public class DemoSingleton {
    //Singleton Pattern
    public static void main(String[] args) {
        DoSth doSth = DoSth.getInstance();
        System.out.println(doSth);
        System.out.println(DoSth.getInstance());
    }
}
class DoSth{
    private DoSth(){} // ห้าม new
    private static DoSth instance;
    public static DoSth getInstance(){
        if(instance  == null){
            instance = new DoSth();
        }
        return instance;
    }
}
