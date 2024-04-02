package com.dsa;

import java.util.ArrayList;

public class string {
    public static void main(String[] args) {
//        String n = "hgdhtd";
//        System.out.println(n); //
//        //String is  a class (all keyword that start withcapital letter is a class)
//        //String is stored in a string pool which is a seperate memory location in heap this helps when we create 2 referance variable have same string then they point towards same string in string pool
//        //string is immutable because many variables can point towards same string thus if one variable changes string this will effetct others string to so it is immutable
//        //$$$$$$$$$ comparision of string $$$$$$$$$$$$$
//        // using ==
//        String a ="abc";
//        String b = "abc";
//        if (a==b){
//        System.out.println("true");} //true as a,b are both pointing towards same string
//            //if 2 variaable points towards 2 same strings then == will give false
//            String c = new String("sanyog");
//            String d = new String("sanyog");
//            System.out.println(c==d); // this will give false
//            //here string will not use string pool and will not be used and strings are created outside it
//            // so now we use equal method
//            System.out.println(c.equals(d)); //this wil give true
//
//
//            //to find char at a index
//            System.out.println(c.charAt(2));
//
//            //prettyprinting or formating
//            float f = 12.3434f;
//            System.out.printf("formatin is %.2f",f); //here we cannot use println
//            //will print ->formatin is 12.34
//
//            //when int is concatinate with string,integer will be converted to Integer(wraper class) that will call tostring()
//        System.out.println("kuna"+ new ArrayList<>()); // kuna[]
//        //to use + for concatination at least 1 concating objects must be string
//        //String ab = new Integer(34)+new ArrayList<>(); // will give error as no string is present whi;e concatinating
//        String ab = new Integer(34)+"rewrwe"+new ArrayList<>();
//        System.out.println(ab);//34rewrwe[]

        //we can add string with char
        System.out.println("ab"+'c'); //abc
        //here new object is created without changing original string"ab"


    }
}
