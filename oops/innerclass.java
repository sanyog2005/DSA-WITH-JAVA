package com.company.oops;
class test1 {
    //inner class is class inside class
    String name;

    public test1(String name) {
        this.name = name;
    }


}
public class innerclass {
    //parent class cannot be a static class
    static class test {
        //inner class is class inside class
        String name;

        public test(String name) {
            this.name = name;
        }


    }

    public static void main(String[] args) {
        test a = new test("kunal"); //this is error as test is inner class and taking reference form class(innerclass) if test class is static error will be removed
        test b = new test("rahul");

        System.out.println(b.name);//will print rahul
        System.out.println(a.name);//will also print rahul as name has been changed to rahul while creting b


        test1 ab = new test1("sanyo"); //will print sanyo
        test1 bc = new test1("sanyog");//will print sanyog because here it is using static class and static class not depends on objects thus name will not change

    }
}
