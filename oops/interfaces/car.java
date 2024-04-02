package com.company.oops.interfaces;

public class car implements engine,media{
    @Override
    public void start() {

    }

    @Override
    public void stop() {
        System.out.println("stop");

    }

    @Override
    public void display() {
        System.out.println("display");
    }
    @Override
    public void acc() {
        System.out.println("acc");

    }

    @Override
    public void abc() {
        engine.super.abc();
    }
//    @Override    ---->gives error as abc is also function of engine thus using this with media generate error of multiple inheritance
//    public void abc() {
//        media.super.abc();
//    }

//The methods inside the interface are by default public abstract which means the method implementation cannot be provided by the interface itself, it has to be provided by the implementing class. Therefore, no need of having a constructor inside the interface.


    //nested interface
    public interface nestedinterface{
        void hello();


    }


}
//syntax to implement nestedinterface
class abv implements car.nestedinterface {

    @Override
    public void hello() {

    }
}
