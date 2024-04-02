package com.company.oops;

public class garbagecollection {
    //garbage collection using finalize

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
        //this will works only when automatic garbage collection gets stopeed due to lot of work
        //when we point a object towards other value in heap previous value is destroyewd by garbage collection
    }
}
