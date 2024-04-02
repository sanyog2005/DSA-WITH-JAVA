package com.dsa;
import java.util.Scanner;
public class datatypes {
    public static void main(String[] args){
//        int integer = 234;
//        //stores 4 bytes of data
//        try / catch
//        char character="s";
//        //stores individual character
//        float decimal = 627.22f;
//        //here we add f at end as default data type for decimal is double
//        double LARGEDECIMAL = 3459349.5934057;
//        //here it stores 8 bytes
//        //it is default so we dont use anything at last like float
//        long longint =86894356834L;
//        //here it stores 8 bytes
//        //here we add L at end as default data type for integer is int;
          //java can auto covert float to int by rounding off it but cant do vise versa as float is biiger value;
//        Scanner sc = new Scanner(System.in);
//
//
//        int a = sc.nextInt();
//        System.out.println(a);
//        //type casting its used to convert the any one data type to another data type
//        float b = 53.99f;
//        int c = (int)(b);  // c will be 53 (int)
//        System.out.println(b);
//        System.out.println(c);



        //converting int to byte
        //we know byte has max value of 256 so any int after that will be converted to byte as
        // byte = int%256

//        int byte_a = 258;
//        byte by = (byte)(byte_a);
//        System.out.println(byte_a);
//        System.out.println(by);   // it is 2


        // FOR CHARACTER JAVA CONVERTS CHAR TO INT BY PRITTING ASCII VALUE OF IT
//        char CH = 'A';
//        int IN = (int)(CH);
//        System.out.println(CH);
//        System.out.println(IN); //ascii value of A is 65


        //if inb any expression any one numb is of float an other are of in then the whole expression wil be evaluated as float
//
          int q =  2;
          float e = 3.1f;
        System.out.println(q * e); // this will give float value
        //so the complete result of he expression will be converted to data type with highest memory space present in the ex[pression



        //
    }
}
