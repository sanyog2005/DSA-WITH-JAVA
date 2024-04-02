package com.company.oops;

public class getter_setter {
    private int a=20;
    public int geta(){
        return a;
    }
    public void sets(int a){
        this.a=a;
    }
    getter_setter(int a){
        this.a=a;
    }

}
class gett extends getter_setter{
    getter_setter ab = new gett(34);
    gett(int a){
        super(a);
    }


    void sa(){

        System.out.println(ab.geta());
    }

    public void main(String[] args) {
        sa();
    }
}
