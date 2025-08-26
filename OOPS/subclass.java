package org.example.modifiers;

import org.example.access.A;

public class subclass extends A {
    subclass(int num,String name){
        super(num,name);
    }

    public void show(){
        display();
        System.out.println("i am having the superclass protected method");
    }

    public static void main(String[] args) {
       /* A s=new A(23,"sam");
        System.out.println(s.num);*/ //this wont execute because we are creating the object of the parent class
        subclass s=new subclass(23,"Sam");
        System.out.println(s.num);
        s.show();
        System.out.println(s instanceof A);
    }
}
