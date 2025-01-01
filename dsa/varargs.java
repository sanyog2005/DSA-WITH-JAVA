package com.dsa;
//import com.company.string;

import java.util.Arrays;
import java.util.Scanner;

//varargs means variabl;e no. of arguments that is it can take variable no. of arguments
public class varargs {
    public static void main(String[] args) {
        variableargs(1,2,"2DFGD3","3DFGDF2", 567,"SFSDF","fsdf","fsdf");
    }
    static void variableargs(int a, int b, String s, String string, int s1, String...v){
        System.out.println(Arrays.toString(v));

    }
 //   static void wrrongvarargs(int a,String ...v,int b){ vararg should always come in last


    }

