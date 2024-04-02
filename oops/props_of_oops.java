package com.company.oops;

public class props_of_oops {
    // 1) inheritance = when props of parents class are passed to child class so that children can use those methods etc
    //child class is derived prom parent class and props of child class cannot be used by parent class
    //we use extends keyword for this
    static int a=10;
    static int sa,  b, qwe=232,sab;
    static void greet(){
        System.out.println("hello");
        //here we cannot use gret() as its of child class
    }
    props_of_oops(int sa, int b){
        this.sa=sa;
        this.b=b;


    }

}
class child extends props_of_oops{
    static int sab,qwe=23;

    child(int sa, int b,int sab) {
        super(23,34);//super calls the parent class constructor
        this.sab=sab;
        //used to initialise values in parent class
        //we cannot access any private value of parent class as private works in class where it was created
    }

    public static void  main(String[] args) {

        greet();
        props_of_oops obj = new child(12,23,65); // here we are referencing child to the parent
        System.out.println(obj.sa);
        System.out.println(obj.b);
        System.out.println(obj.sab);
        System.out.println(obj.qwe);
        //child obj2 = new props_of_oops(12,23,56); will give erroe as parent is referencing to child
        //child obj2 = (child) new props_of_oops(12,23);//here it will take only 3 variale

    }
    void gret(){
        System.out.println("parent cannot use it");

    }
    void gret2(){
        System.out.println("parent cannot use it");
        System.out.println(this.qwe);//will print value of qwe of child class
        System.out.println(super.qwe);//will print value of qwe of parent class
    }
}
