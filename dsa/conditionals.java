package com.dsa;
import  java.util.Scanner;

public class conditionals {
    //to print max no. among 3
    public static void main(String[] args) {
//        int a= 23;
//        int b = 43;
//        int c = 56;
//        int max = a;
//        if (b>max){
//            max = b;
//
//        }
//        if (c>max) {
//            max = c;
//
//        }
//        System.out.println(max);

        // to check wheater char is a capital or not

//        Scanner sc = new Scanner(System.in);
////        char a = sc.next().trim().charAt(0);
////        if(char >= 'a' && char <= 'z'){
////            System.out.println("capital");
////        }
////        else{
////            System.out.println("short");
////
////        }
//        char a = sc.next().trim().charAt(0);
//        if (a >= 'a' && a <= 'z') {
//            System.out.println("capital");
//
//        } else {
//            System.out.println("short");
////
////
//        }




//        //fibonnacci series
//         int a = 0;
//         int b = 1;
//         int c;
//         int n = 10;
//        System.out.println(a);
//        System.out.println(b);
//
//         while (n>0){
//             c=a+b;
//             System.out.println(c);
//             a=b;
//             b=c;
//             n--;
//
//         }



//        //to check how many times a number 7 is occuring in integer
//        int a =145788777;
//        int c=0;
//        while(a>1){
//
//            int b = a%10;
//
//
//            if(b==7){
//                c++;
//            }
//            a = a/10;
//        }
//        System.out.println(c);

        // to reverse the number
        int a = 1234567;
        int b = 0;
        int c;

        while(a>0){

            c = a%10;
            a=a/10;
            b = b*10 + c;



        }
        System.out.println(b);

    }
}

