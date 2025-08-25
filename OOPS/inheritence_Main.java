package inheritance;

public class Main {
    public static void main(String[] args) {
        //Box obj=new Box();
        //Box obj=new Box(5);
        //Box obj=new Box(3,5,1);
        //Box obj=new Box(1,2,3);
        //Box obj2=new Box(obj);
        //System.out.println(obj.l+" "+obj.h+" "+obj.w);

        BoxWeight b=new BoxWeight(20,15,23,93);
        System.out.println(b.l+" "+b.h+" "+b.w+" "+b.weigth);

        Box b1=new BoxWeight(1,2,3,4);
        //System.out.println(b1.weight);//nor execute because base class dont have the weight variable
        System.out.println(b1.l);

        /*BoxWeight b2=new Box(1,2,3);
        System.out.println(b2.weight);*/ //not execute at all

        BoxPrice b3=new BoxPrice(1,2,3,4,5);
        System.out.println(b3.l+" "+b3.h+" "+b3.w+" "+b3.weigth+" "+b3.cost);
    }

}
