/*Write a program to print whether a number is even or odd, also take input from the user.*/
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number: ");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }

        System.out.println("=================================");

        //Take name as input and print a greeting message for that particular name.
        System.out.println("enter a name: ");
        String name=sc.nextLine();
        System.out.println("Hello.. "+name+" Nice to meet youuu!");

        System.out.println("==================================");

        // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        System.out.println("Enter the Value of(Principal,Rate,Time): ");
        float principle=sc.nextFloat();
        float rate=sc.nextFloat();
        float time=sc.nextFloat();
        float result=(principle*rate*time)/100;
        System.out.print("The simple Interest is: "+result);
        System.out.println(" ");

        System.out.println("********************************************");


        //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        while(true){
            System.out.println("Enter an operator(+,-,*,/) or x to exit: ");
            char ch=sc.next().charAt(0);
            if(ch=='X' || ch=='x'){
                System.out.println("exiting.....Thank you");
                break;
            }
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'){
                System.out.println("Enter Two Numbers: ");
                int f=sc.nextInt();
                int s=sc.nextInt();
                if (ch == '+') {
                    System.out.println("Addition: "+(f+s));
                }
                if(ch=='-'){
                    System.out.println("Subtraction: "+(f-s));
                }
                if(ch=='*'){
                    System.out.println("Multiplication: "+(f*s));
                }
                if(ch=='/'){
                    if(s!=0) {
                        System.out.println("Division: "+(f/s));
                    }
                    else{
                        System.out.println("error! cannot be divided by zero");
                    }
                }
            }
            else{
                System.out.println("Wrong Input!try Again");
            }


        }


         System.out.println("============================");


        //Take 2 numbers as input and print the largest number.

        System.out.println("Enter Two Numbers: ");
        int first=sc.nextInt();
        int second=sc.nextInt();
        if(first>second){
            System.out.println(first+" is the largest number");
        }
        else if(second>first){
            System.out.println(second+" is the largest number");
        }
       else{
            System.out.println("Both are equal");
        }

        System.out.println("=========================================");


        //Input currency in rupees and output in USD.
        System.out.println("Enter Indian Rupee: ");
        double inr=sc.nextDouble();
        double conversion_rate=83.50;
        double usd=inr/conversion_rate;
        System.out.printf("Equivalent USD: %.2f", usd);

        System.out.println("============================================");


        //To calculate Fibonacci Series up to n numbers.
        System.out.println("enter the value of p: ");
        int p=sc.nextInt();
        int m=0;
        int n=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int temp=m+n;
            m=n;
            n=temp;
        }
        System.out.println("======================================");

        //To find out whether the given String is Palindrome or not.
        System.out.println("Enter a name: ");
        String names=sc.nextLine();
        String reverse="";
        for(int i=names.length()-1;i>=0;i--){
            reverse+=names.charAt(i);
        }
        if(reverse.equalsIgnoreCase(names)){
            System.out.println("It is palindrome");
        }
        else{
            System.out.println("it is not a palindrome");
        }
        System.out.println("==========================================");

        //To find Armstrong Number between two given number.
        System.out.println("enter two numbers: ");
        int one=sc.nextInt();
        int two=sc.nextInt();
        for(int i=one;i<=two;i++){
            int temp=i;
            int digits=0;
            while(temp!=0){
                temp=temp/10;
                digits++;
            }
            temp=i;
            int sum=0;
            while(temp!=0){
                int digit=temp%10;
                sum+=(int)Math.pow(digit,digits);
                temp=temp/10;
            }
            if(sum==i){
                System.out.println(i);
            }

        }

    }
}
