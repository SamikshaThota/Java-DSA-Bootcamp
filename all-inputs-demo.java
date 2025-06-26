import java.util.Scanner;
public class AllInputsDemo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("integer input: ");
        int a=sc.nextInt();
        System.out.println(a);
        System.out.println("Float input: ");
        float f=sc.nextFloat();
        System.out.println(f);
        System.out.println("Double input: ");
        double d=sc.nextDouble();
        System.out.println(d);
        System.out.println("Long input: ");
        Long l=sc.nextLong();
        System.out.println(l);
 
 //this takes only first word of the sentence       
        System.out.println("String input: ");
        String s=sc.next();
        System.out.println(s);
        
//this is used for String input        
        System.out.println("String input: ");
        String s1=sc.nextLine();
        System.out.println(s1);

//this is used for character input
        System.out.println("enter a String: ");
        char ch=sc.next().charAt(0);
        System.out.println(ch);

    }
}
