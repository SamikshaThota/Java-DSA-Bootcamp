package org.example.interfaceDemo;

public interface Animal {
    static int add(int a,int b){//static method
        return a+b;
    }
    void sound();//abstract method
    int legs=4;
}
class Dog implements Animal{
    @Override
    public void sound(){
        System.out.println("I can make sound");
    }
}
class InterfaceMain{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
        System.out.println("the answer is: "  +Animal.add(5,2));
        System.out.println(Animal.legs);
    }
}
