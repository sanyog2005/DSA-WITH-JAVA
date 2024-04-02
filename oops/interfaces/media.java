package com.company.oops.interfaces;

public interface media {
    void start();
    void stop();
    void display();
    static int san(){
        System.out.println("sanyog");
        return 0;

    }
    default void abc(){
        System.out.println("hello medias");

    }

}
