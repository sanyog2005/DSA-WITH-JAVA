package com.company.oops;

public class polymorphism {
    //it means many ways to rewpresent simple entity or item


    //code for dynamic poly
    public static void main(String[] args) {
        circle cir = new circle();
        square ci = new square();
        shape r = new shape();
        shape rq = new circle();       //here circle() will decide which method to be called thus is is called upcasting
        

        cir.area();  //i am area of circle
        ci.area();   //i am area of squaee
        r.area();    //i am shape
        rq.area();    //i am area of circle

    }
}
class shape{
   // @Override -> will give error as the no over riding is taking place
//   final void area(){
//       System.out.println("i am shape"); this will give error as final function can not be overrided called early binding
    //if we put final in parent class we cannot inherit it
    //and method of those class will also become final automatically

//    @Override //-> will give error as the no over riding is taking place
    void area(){
        System.out.println("i am shape");
    }
    //static funct cannot be overrided as the method of parent class will be called as static does not depends on object as overriding depends on object
    static void areaaa(){
        System.out.println("i am shape areaaa");
    }
}
class circle extends shape{
    @Override
    void area(){
        System.out.println("i am area of circle");

    }
//    @Override this will give error as it is a static function
    static void areaaa(){
        System.out.println("i am shape areaaa in circle");
    }

    public static void main(String[] args) {
        circle obje = new circle();
        obje.areaaa();//i am shape areaaa in circle
        obje.area();//i am area of circle

        shape area = new circle();
        area.areaaa();//i am shape areaaa -> it is not overrided but it can be inherited
        area.area();//i am area of circle ->method overidded

        shape ar = new shape();
        ar.areaaa();//i am shape areaaa
        ar.area();//i am shape




    }

}class square{
    void area(){
        System.out.println("i am areas of square");
    }
}

//types of polymorphism

//1) compile time poly or static poly
//achieved by method overloading
//same name of methods but different type arguments,return types,ordering can be different ex) constructor with multiple arguments format

//2) run time or dynamic poly
//achieved by method overriding
// when methods have same name but they are of different classes and have different functionalities



//dynamic method dispatch
//it is a call that helps to determine which version of method to call while run time