//package com.dsa;
//
//import java.util.Scanner;
//
//public class arrays {
//    public static void main(String[] args) {
//
//
//    //collection of data of same data type
//    //syntax
//    //datatype[] name = new datatype[no. of data to be stored in array]
//    int[] ar={3,4,5,3,3};
//    int[] arr= new int[5]; //new is used to create new element
//    int[] array1; //declaration of array
//    array1 = new int[5]; //initialisation and sizing of array
//     //int[] arr(takes place at run time) = new int[50](this happens at run time thus called dynamic memory allocation)
//        //array name stored in stack but the data in it is stored in heap and these are not stored in continos manner
//        //thus in java arrays may not be stored in a continous manner
//
//        //########indexing#######
//        //array[0]->first element
//        //array[-1]->last element
//      String[] ars = new String[10];
//      ars = new String[]{"DF", "dff"};
//        System.out.println(ars[0]);
//
//        String[] arsv = new String[10];
//        System.out.println(arsv[0]); //this will print null as the arraay is empty
//        Scanner sc = new Scanner(System.in);
//        int[] are = new int[10];
//        for(int i=0; i<=are.length; i++){
//            are[i]= sc.nextInt();
//            if(i == 8){
//                break;
//            }
//
//
//        }
//        for(int i=0; i<=are.length; i++){
//            System.out.println(are[i]);
//
//
//        }
//        //above loop cAN also be written as (called for each loop)
//        for(int num : are){
//            System.out.println(num);//num represents elemnet of array
//        }
//
//
//
//
//    }}

//arrays of object
//package com.dsa;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class arrays {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String[] str = new String[6];
//        for(int i=0;i<=str.length;i++){
//            str[i]= sc.next();
//
//        }
//        System.out.println(Arrays.toString(str));
//        str[3]="abcde";
//        System.out.println(str[3]); //we can change individual element of array cso they are mutable
//
//    }}

//$$$$$$$$$$$$$$$ 2D array
package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
//        int[][] arr = new int[3][3]; //[rows][columns stating a=col.umn no. is not necessary]
//        int[][] arr ={
//                {1,2,3},
//                {1,2,3},
//                {1,2,3}
//
//        };
        //2d array is a array of array
        //arr[2][3] is second row and 3rd column elemnet which is 3
        //arr[1] this will print complete row one {1,2,3}
        Scanner sc = new Scanner(System.in);

        int[][] arra = new int[3][3];
        for (int i = 0; i <arra.length; i++){
            for(int j=0; j<arra[i].length;j++){
                arra[i][j]= sc.nextInt();
                if(j==3){
                    break;
                }

            }

        }
        for (int row =0;row<arra.length; row++){
            for (int col=0; col<arra[row].length; col++){
                System.out.println(arra[row][col]+"");
            }
            System.out.println("");

        }
    }
    }