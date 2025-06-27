import java.util.Scanner;
public class LargestDemo{
    public static void main(String[] args) {
        System.out.println("enter 3 numbers: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("the largest number is: ");
        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }

        //second way of solving
        int max=a;
        if(b>max){
            max=a;
        }
        if(c>max) {
            max=c;
        }
        System.out.println(max);


        //third way
        int maximum=Math.max(c,Math.max(a,b));
        System.out.println(maximum);
    }
}
