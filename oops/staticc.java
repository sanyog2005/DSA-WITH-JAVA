package com.company.oops;

public class staticc {
    //static keywords can be used even before object being created
    static int a = 4;
    static int b;

    static {
        //this will executed only once when claass is loaded and then will not run again when a object is created with it
        System.out.println("i am staic block");
        b=a*5;
    }
    public static void main(String[] args) {
        //main is static as it is the first thing we have to run without creating an object of class staticc
        //we cannot use anything which is not static in any static funct
       // greet();//this will give error as it is not staic
        // as something which is not static belongs to object
        //main is static as it does not depends on object
        greet2();//this will work

        staticc obj = new staticc();
        obj.greet();//now this willl work as we have creted a object


        //(this) can also not be used in a non static function as this requires a object hence we cannot use this in non static functions


        staticc objj = new staticc();
        System.out.println(staticc.a+"  "+staticc.b); // o/p ->4 20


    }
    void s(){
        greet();//here a non static function can be called

    }
    void greet(){
        System.out.println("hello");
    }
    static void greet2(){
        System.out.println("hello");
    }
}
