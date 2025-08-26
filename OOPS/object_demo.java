package org.example.access;

public class ObjectDemo {
    int num;
    ObjectDemo(int num){
        this.num=num;
    }
    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
    public static void main(String[] args) {
        ObjectDemo obj=new ObjectDemo(74);
        //System.out.println(obj.hashCode());

        //System.out.println(obj instanceof Object);
        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getName());
    }


}
