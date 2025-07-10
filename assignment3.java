import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three values: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int result=largest(a,b,c);
        System.out.println("the largest number is: ");
        System.out.println(result);

        //Scanner sc=new Scanner(System.in);
        System.out.println("enter any number: ");
        int number=sc.nextInt();
        EvenOdd(number);

        //Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(vote(age)){
            System.out.println("you are eligible to vote");
        }
        else{
            System.out.println("not eligible to vote");
        }

        //Scanner sc=new Scanner(System.in);
        int aa=sc.nextInt();
        int bb=sc.nextInt();
        int ans=add(a,b);
        System.out.println(ans);

        //Scanner sc=new Scanner(System.in);
        int aaa=sc.nextInt();
        int bbb=sc.nextInt();
        int answer=product(a,b);
        System.out.println(answer);

        double area=area(8);
        double circumference=circumference(6);
        System.out.printf("the area of circle is: %.2f\n",area);
        System.out.printf("the circumference of circle is: %.2f\n",circumference);

        //Scanner sc=new Scanner(System.in);
        int aaaa=sc.nextInt();
        boolean res=isPrime(aaaa);
        System.out.println(res);

        //Scanner sc=new Scanner(System.in);
        int as=sc.nextInt();
        marks(as);

        //Scanner sc=new Scanner(System.in);
        int ab=sc.nextInt();
        int fact=fact(ab);
        System.out.println(fact);


        //Scanner sc=new Scanner(System.in);
        int abb=sc.nextInt();
        int baa=sc.nextInt();
        int cbb=sc.nextInt();
        if(example(abb,baa,cbb)){
            System.out.println("It is a Pythagorean triplet.");
        }
        else{
            System.out.println("Not a Pythagorean triplet.");
        }

        //Scanner sc=new Scanner(System.in);
        int aac=sc.nextInt();
        if(palindrome(aac)){
            System.out.println("This is Palindrome");
        }
        else{
            System.out.println("this is not Palindrome");
        }



    }


    static int largest(int a,int b,int c){
        int max=0;
        if(a>b && a>c){
            max=a;
        }
        else if(b>c){
            max=b;
        }
        else{
            max=c;
        }
        return max;

    }

    static void EvenOdd(int a){
        if(a%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }

    static boolean vote(int age){
        boolean hasvote=false;
        if(age>=18){
            hasvote=true;
        }
        else{
            hasvote=false;
        }
        return hasvote;
    }

    static int add(int a,int b){
        return a+b;
    }

    static int product(int a,int b){
        return a*b;
    }

    static double area(int r){
        return Math.PI*r*r;
    }
    static double circumference(int r){
        return 2*Math.PI*r;
    }

    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++) {
            if (n % i == 0) return false;
        }
        return true;

    }

    static void marks(int num){
        if(num<=40) {
            System.out.println("Fail");
        }
        else if(num<=50){
            System.out.println("DD");
        }
        else if(num<=60){
            System.out.println("CD");
        }
        else if(num<=70){
            System.out.println("BC");
        }
        else if(num<=80){
            System.out.println("BB");
        }
        else if(num<=90){
            System.out.println("AB");
        }
        else{
            System.out.println("AA");
        }
    }

    static int fact(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact*=i;
        }
        return fact;
    }

    static boolean example(int a,int b,int c){
        int[] num ={a,b,c};
        java.util.Arrays.sort(num);

        return num[0]*num[0]+num[1]*num[1]==num[2]*num[2];

    }
    static boolean palindrome(int num){
        int temp=num;
        int rev=0;
        while(temp!=0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
        }
        return rev==num;
    }
}
