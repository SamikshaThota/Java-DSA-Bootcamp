package org.example.access;

public class A {
    //private int num;
    //public int num;
    protected int num;
    String name;
    int[] arr;

    public A(int num, String name){
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }
    protected void display(){
        System.out.println("hello i am protected");
    }

    public int getNum(){
        return num;
    }
    public void setNum(int num){
        this.num=num;
    }
}
