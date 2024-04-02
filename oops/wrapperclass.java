package com.company.oops;

public class wrapperclass {
    public void main(String[] args) {
        int a = 10; // a is a primitive variable
        Integer num = 45; // num is a object of wrapper class
        //here Integer is wrapper class that have many properties and methods

        //int use call my value as it is primitive
        //objects created by Integer(wrapper class) use call by reference but tehse can also not change the values as they use final
        //final is used to prevent any object to be modified
        final int BO =3;
        //BO=2;//this will give error as we have used final


        final Students juna = new Students("mqks");
        juna.markss="2dwd"; //BUT WE CAN CHANGE THE OBJECTS THAT ARE CREATED WITH FINAL
        //but we cannot reassign it
        // juna= new Students("sdsd"); this will give error
    }
    class Students{

        String markss;
        Students(String markkss){
            markss=markkss;


        }

    }
}
