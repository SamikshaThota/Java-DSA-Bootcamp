import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        //Q:take input of 2 numbers and print the sum
        sum();

        int ans=sum2();
        System.out.println(ans);

        String message=greet();
        System.out.println(message);

        int answer=sum3(20,30);
        System.out.println(answer);

        String personalized=myGreet("Samiksha");
        System.out.println(personalized);

        Scanner sc=new Scanner(System.in);
        String naam=sc.nextLine();
        String Result=myGreet(naam);
        System.out.println(Result);

        int a=10;int b=20;
        swap(a,b);
        System.out.println(a+" "+b);

    }

    static void swap(int a,int b){
        int temp=b;
        b=a;
        a=temp;
    }
    static String myGreet(String name){
        String message="hello "+name;
        return message;
    }
    static int sum3(int a,int b){
        int sum=a+b;
        return sum;
    }
    static String greet(){
        String greeting="hello,People!";
        return greeting;
    }
    static int sum2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a: ");
        int a=sc.nextInt();
        System.out.println("enter the value of b: ");
        int b=sc.nextInt();
        int sum=a+b;
        return sum;
    }
    static void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a: ");
        int a=sc.nextInt();
        System.out.println("enter the value of b: ");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("The Sum: "+sum);

    }
}
