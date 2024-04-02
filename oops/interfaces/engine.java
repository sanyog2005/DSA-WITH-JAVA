package com.company.oops.interfaces;

public interface engine {
    static final int Price = 7000;
    void start();
    void stop();
    void acc();


    //static methods in interface should always have body as they cannot be overrided and should be called with interface name
    //like -> engine.san();
    static int san(){
        System.out.println("sanyog");
        return 0;
    }


    default void abc(){
        System.out.println("hello");
//default function is used when there is only 1 method of name abc in all the interfaces
    }
}
