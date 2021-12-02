package com.company.SingeltonDisignPattern;

public class SingelEager {
    //Create an Object of SingeltonObject
    private static SingelEager instance = new SingelEager();

    //Make the constructor private so that this class cannot be instantiated
    private SingelEager(){}

    //Get the only object available
    public static SingelEager getInstance(){
        return instance;
    }

}
