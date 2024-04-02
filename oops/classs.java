package com.company.oops;

import java.util.Scanner;

public class classs {
    // .  operator links object referance variable to the class
    //instance variable are variables inside the class
    public static void main(String[] args) {
        Students[] student = new Students[5];

        //creating a object
        //
        // 1
        Students kunal;
        kunal = new Students("s");
        //primitive data types are not required to created with new keyword,objects are created with new

        //2
        Students kunal1 = new Students("s");

        //Students() is a constructor its is default method that gets created in the class which has same name as class
        //it runs when we crete a object and it allocates the variable as we like


        System.out.println(kunal); // will print com.company.oops.Students@6d03e736

        //using variables of class Student
        //here jvm checks wheather kunal conatains name if yes then prints the name else print default value null


        System.out.println(kunal.marks); //0.0
        System.out.println(kunal.rno); //0
        System.out.println(kunal.name); //null

        //assinging values to those variabl;es
        kunal.marks= 23.42F;
        kunal.rno=21;
        kunal.name="sda";
        System.out.println(kunal.marks); //23.42
        System.out.println(kunal.rno); //21
        System.out.println(kunal.name); //sda
        //we cannot use variables that are not been created in class student ex) we cannot use kunal.sallary as sallary was not created in the student class



          System.out.println(kunal1.marks)   ; //this.marks= 23.42F;     //here kunal1 will use values of name,rno, marks as the values of constructor Students
          System.out.println(kunal1.rno);      //this.rno=212;
                                               //this.name="sda";
          kunal1.name="sdadfsdfdsf";
          System.out.println(kunal1.name); //here it will not use the constructor values it will print->sdadfsdfdsf

        kunal.greet(); //greet as name sda
        kunal1.greet(); //greet as name sdadfsdfdsf
        kunal1.changename("sanyog");
        kunal1.greet(); //greet as name sanyog
        Students kunal2 = new Students(23.1f,23,"sa");
        System.out.println(kunal2.marks);
        System.out.println(kunal2.rno);
        System.out.println(kunal2.name);

        Students kunal3 = new Students();
        System.out.println(kunal3.marks);//13.2
        System.out.println(kunal3.rno);  //23
        System.out.println(kunal3.name); //sany






//creaTING A object in a class using new keyword alocatetes memory dynamically
        //
        // Students student1 /*(compile time)*/ = new Students();/*(run  time)*/
    }

}
class Students{
    int rno;
    String name;
    float marks;
    //we need a way to add the values of the above properties object by obejct
    //we need one word to access every object


    Students(String markss){
        this.marks= 23.42F;
        this.rno=212;
        this.name="sda";
    }
    Students(){
        //calling constructor from another constructor
        this(13.2f,23,"sany"); //here it is calling the constructoir with 3 of these arguments
        // internall it is like this new Students(13.2f,23,"sany");
    }
    public void greet(){
        System.out.println("greet as name"+" "+name+" ");
    }
    void changename(String nname){
        name = nname;
    }
    Students(float mmarks, int rnno , String nanme){
        marks= mmarks;
        rno=rnno;
        name=nanme;
    }

}