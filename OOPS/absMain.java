package org.example.abstractDemo;

public class Main {
    public static void main(String[] args) {
        B b=new B(22,"Sam");
        b.work();
        b.run();
        A.play();
        b.start();
        b.stop();
        b.brake();
        System.out.println(A.gender);
        System.out.println(b.age);
    }
     /*Son s=new Son(34);
        s.career();
        s.partner();
        Parent.display();
        Son s2=new Son(32);
        s2.display2();*/
}
