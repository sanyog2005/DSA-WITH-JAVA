package com.dsa.question;
import java.util.Arrays;


public class twoSum {

    static int target = 9;
    public static void main(String[] args){
        int[] A = {2,6,11,7};
        for(int i = 0; i<A.length; i++){
            for(int j = 0 ; j<A.length; j++){
                if (A[i]+A[j] == target) {
                    System.out.println(i);
                    System.out.println(j);

                }

            }

        }

       }
}
