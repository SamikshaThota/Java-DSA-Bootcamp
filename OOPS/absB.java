package org.example.abstractDemo;

import org.example.interfaceDemo.Brake;
import org.example.interfaceDemo.Media;

public class B extends A implements Brake, Media {
    B(int num,String name){
        super(num,name);
    }
    @Override
    public void work(){
        System.out.println("i am working");
    }
    @Override
    void run(){
        System.out.println("I am running");
    }

    @Override
    public void brake() {
        System.out.println("I have brake");
    }

    @Override
    public void start() {
        System.out.println("i am a start");
    }

    @Override
    public void stop() {
        System.out.println("I am a stop");
    }
}
