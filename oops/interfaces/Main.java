package com.company.oops.interfaces;

public class Main {
    public static void main(String[] args) {
        car c = new car();
        c.acc();
        c.display();
        c.start();
        engine e = new car();
        media m = new car();

        engine.san();
//        e.san(); this will give error
//        m.san(); this will give error

        media.san();
//        c.san(); this will give error
        m.abc();
    }
}
