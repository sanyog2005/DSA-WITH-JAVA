package com.dsa;

public class SHADOWING_OF_VARIABLE {
    static int x= 30;
    static int z = 100;


    public static void main(String[] args) {
        System.out.println(x);// here it will print x = 30 as the scope of x is inside whole class SHADOWING_OF_VARIABLE
        int x = 20; //but w can redclare it as x= 30
        System.out.println(x);
        scope();
        System.out.println(z); //will print z as 100 as declared in class SHADOWING_OF_VARIABLE
        int z;
//        System.out.println(z); here we cannot use it as scope hasn't begin yet
        z=300;
        System.out.println(z);// now after value has been assinged to z the scope has begin and value has been shadowed

    }
    static void scope(){
        System.out.println(x); //here it will print x as 30 as declared in class SHADOWING_OF_VARIABLE
        int x = 10;
        System.out.println(x); // here value of x declared in class SHADOWING_OF_VARIABLE hs been shadowed thus it has changed to 10


    }
}
//output 
// 30
// 20
// 30
// 10
// 100
// 300
