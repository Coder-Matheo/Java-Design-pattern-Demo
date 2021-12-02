package com.company.SingeltonDisignPattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleEager singleEager = new SingleObject();

        //Get the only singleEager available
        SingelEager singelEager = SingelEager.getInstance();
        System.out.println(singelEager);

        //Get the only singleEager available
        SingelEager singleEager1 = SingelEager.getInstance();
        System.out.println(singleEager1);

        //Get the only singleEager available
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        //Get the only singleEager available
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);



    }
}
