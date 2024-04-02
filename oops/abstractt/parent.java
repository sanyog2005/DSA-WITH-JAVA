package com.company.oops.abstractt;

public abstract class parent {
    //class that contain 1 or more abstract mewthods
    abstract void career();
    //the functionalities of this method will be in the child class of parents and to use it we have to override the method
    abstract void partner();
 //Abstract classes can have constructors, but they cannot be instantiated directly. The constructors are used when a concrete subclass is created. There may be one or greater abstract methods in an abstract class, which signifies that those methods are not implemented by means of the class.

    // we can create normal function that are not static method
    //we cannot create static abstract functions
    void hello(){
        System.out.println("hello");
    }

//    abstract  parent();  abstract constructors are not allowed
     parent(){
        System.out.println("constructor");
    }
}
class childd extends parent{

    @Override
    void career(){
        System.out.println("career");

    }
    @Override
    void partner(){
        System.out.println("'partner");

    }


}
