package org.example.generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        int[] temp=new int[DEFAULT_SIZE*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFull() {
        return size==data.length;
    }

    public int remove(){
        return data[--size];
    }

    public int size(){
        return size;
    }

    public int get(int index){
        return data[index];
    }

    public void set(int index,int num){
        data[index]=num;
    }

    public String toString(){
        return "List"+ Arrays.toString(data);
    }
    public static void main(String[] args) {
        //ArrayList list=new ArrayList();
        CustomArrayList list=new CustomArrayList();
        list.add(5);
        list.add(20);
        list.add(74);
        System.out.println(list);
    }
}
