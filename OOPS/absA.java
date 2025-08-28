package org.example.abstractDemo;

abstract public class A{
    int num;
    String name;
    final int age=10;
    static String gender="Female";
    public A(int num, String name){
        this.num=num;
        this.name=name;
    }
    abstract void work();
    static void play(){
        System.out.println("i am playing");
    }
    void run(){
        System.out.println("i am running");
    }
}
