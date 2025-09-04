package org.example.generics;

import java.util.Arrays;
import java.util.List;

public class CustomArrayList<T extends Number>{
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public CustomArrayList(){
        this.data=new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list){
        //
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        Object[] temp=new Object[DEFAULT_SIZE*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFull() {
        return size==data.length;
    }

    public T remove(){
        return (T) data[--size];
    }

    public int size(){
        return size;
    }

    public T get(int index){
        return (T)(data[index]);
    }

    public void set(int index,int num){
        data[index]=num;
    }

    public String toString(){
        return "List"+ Arrays.toString(data);
    }
    public static void main(String[] args) {
        //ArrayList list=new ArrayList();
        CustomArrayList<Integer> list=new CustomArrayList<>();
        list.add(5);
        list.add(20);
        list.add(74);
        System.out.println(list);
    }
}
