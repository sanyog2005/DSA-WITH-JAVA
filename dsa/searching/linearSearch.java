package com.dsa.searching;

public class linearSearch {
    public static void main(String[] args) {
        int [] Arrayb = {1,2,4,5,6,7};
        int target = 7;
        int ans = LinearSearch(Arrayb,target);
        System.out.println(ans);

        }
    public static int  LinearSearch(int[] Arrayb, int target) {
        if (Arrayb.length == 0){
            return -2;

        }
        else {
            for (int i = 0; i<Arrayb.length; i++){
                if (Arrayb[i] == target) {
                    return i;


                }

            }

        }
        return target;
    }
    }


// Linear search is most simple searching algorithm here we directly searvh the arrry to find the targett alement
// liner search time compleaxity
//worst  case =n  as here we have to search complete array of n elemnet to find the target
//best case = 1 as here we will find the targett element at the first insex of the array

