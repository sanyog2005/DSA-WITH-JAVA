package com.dsa;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        //array list is a array where we dont give its size while initializing
        //syntax
        ArrayList<Integer> list = new ArrayList<>(20);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        list.add(23);
        System.out.println(list);
        //output [23, 23, 23, 23, 23, 23, 23, 23]
        System.out.println(list.contains(23)); //true
        System.out.println(list.contains(232)); //false
        list.remove(2);
  //
    }











}
