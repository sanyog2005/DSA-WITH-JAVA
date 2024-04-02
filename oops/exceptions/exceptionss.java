package com.company.oops.exceptions;

public class exceptionss {
    //objects gives throwables thAT are of two types
    //1) exceptions --- caused due to hinderence in program that tryies to block normal flow of program
    //2) error----caused due to lack of resources


    //exceptions are of 2 types
    //checked
    //exceptions during run time ex)file not found

    //unchecked
    //these are not detected by complier wh9ile running

    public static void main(String[] args) {
        int a = 3;
        int b=0;
        //int c=a/b;
//        System.out.println(c);
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at com.company.oops.exceptions.exceptionss.main(exceptionss.java:19)
        try{
            devide(1,0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());/// by zero
        }finally {
            System.out.println("this will aLWAYS HAPPEN even above try catch happen or not");
        }




}
    static int devide(int a,int b) throws ArithmeticException{
        if (b==0){
            throw new ArithmeticException("do not take b as 0");
        }
        return a/b;
    }

}
