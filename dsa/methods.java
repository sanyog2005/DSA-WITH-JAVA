package com.dsa;

public class  methods {
//    public static void main(String[] args) {
//////        sum(2,675);
//////        difference(30,21);
//        String s=hello();
//        System.out.println(s);
//
//    }
////        int a=10,b=20;
////        swap(a,b);
////        System.out.println("the changed value of a& b" +a +" "+b);
//
//    }
//    static void sum( a , b){  //as its using a void so we dont have to use return statement
//        int c = a+b;
//        System.out.println(c);
//
//    }
//    static int difference(int s, int d){
//        int g = s-d;
//        System.out.println(g);
//        return g;
//        //System.out.println(d); // this print statement wont work as its present after return staement
//    }
//    static String hello(){
//        String MSG = "hello abc";
//        return MSG;
//    }}







    ////********************parameters*************************
//    when we pass the values to the method to perform its function the values are called parameter


//    static void sum(int a ,int b){  //as its using a void so we dont have to use return statement
////        int c = a+b;
////        System.out.println(c);
    // here a,b are parameters

//    static void swap(int a,int b){
//        int temp = a;
//        a=b;
//        b=temp;
//        System.out.println("the changed value of a& b" +a +" "+b);
        //this function only changes the value of a and b in the scope of this method only and does not swaps the true va;lue f a and b so whn we use a,b outside the function they remain unchainged
        //here in java they just take value from the real value but cant alter its real values



    //###########SCOPE OF THE VARIABLE###############3
    //THE SCOPE OF VARIABLE ENDS IF WE USE IT OUTSIDE THE FUNCTION
    static void scope(){
        int a = 20;
        System.out.println(a); //will print 20
        a = 30;
        System.out.println(a); //will print 30

    }
//
    public static void main(String[] args) {
        int a = 10;
        scope();
        System.out.println(a); //a will not change to 20 as the scope of a in the function scope() has  ended outside the function
        //if the scope of any variable is not ended you cannot initialize it again like we have initialized a twice ones in scope() and ones in main()
        int b = 30;
        System.out.println(b); //this will print 30
        {
            b= 10; // value of b has been changed
            System.out.println(b); //wil print 10
        }
        System.out.println(b); // will print 10 as we just changed the value of b above
        {
//            int b = 20; //we cannot declare it in a block as we have already declated it but we can declare it again in a function but the scope of that variable will end outsdie the function
        }
        {
           int c = 30;
            System.out.println(c); //here we declared a value of c in a block of scope

        }
//        System.out.println(c); //but we cannot use c outside the block but we can again declare it as it was earlier declared outside the function
        int c = 20;
        System.out.println(c);// it will print 20 as we have declared it agaING OUTSIDE SCOPE OF THE BLOCK

    }
}

