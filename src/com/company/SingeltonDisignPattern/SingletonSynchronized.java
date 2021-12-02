package com.company.SingeltonDisignPattern;

//Multiple Thread
public class SingletonSynchronized {
    private static SingletonSynchronized instance;

    private SingletonSynchronized(){ }

    public static synchronized SingletonSynchronized getInstance(){
        if (instance == null){
            synchronized (SingletonSynchronized.class){
                instance = new SingletonSynchronized();
            }
        }
        return instance;
    }
}
