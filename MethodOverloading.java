import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        fun(74);
        fun("Sameer");
        demo(1,2,3,4,5,6,7);
        demo1("samiksha","Sameer");

    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
    static void demo(int...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo1(String...v){
        System.out.println(Arrays.toString(v));
    }
}
