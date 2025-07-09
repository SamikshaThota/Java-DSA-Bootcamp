import java.util.Arrays;

public class ShadowingAndVarargs {
  //concept of shadowing
    static int x=10;
    public static void main(String[] args) {
        System.out.println(x);
        int x;
        //System.out.println(x);//error because is not initialized.
        x=20;
        System.out.println(x);
        fun();
        fun1(1,2,3,4,5,6,7);
        fun2(1,2,"Samiksha","Sameer","Sam");
    }
    static void fun(){
        System.out.println(x);
    }

    //Var-Args
    static void fun1(int...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun2(int a,int b,String...v){
        System.out.println(a+" ,"+b+" ,"+Arrays.toString(v));

    }
}
