package org.example.interfaceDemo;

public interface A {
    void methodA();
    default void fuel(){
        System.out.println("hi i am a fuel");
    }
}
interface B extends A{
    void methodB();
    @Override
    default void fuel(){
        System.out.println("hi i am a another fuel");
    }
}
class C implements A,B{
    public void methodA(){
        System.out.println("I am method A");
    }
    public void methodB(){
        System.out.println("I am method B");
    }
    /*we are not overriding the default method means the child
    interface extending the parent interface wins the highest priority so child interface wins.
    for suppose if there is two interfaces & it is not extending then the class implementing the
    both interface should override the default method.*/
}
class ABMain{
    public static void main(String[] args) {
        C c=new C();
        c.methodA();
        c.methodB();
        c.fuel();
    }
}
