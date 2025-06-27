import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ans=0;
        while(true){
            System.out.println("enter an operator: ");
            char ch=sc.next().charAt(0);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%'){
                System.out.println("enter the two values: ");
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println();
                if(ch=='+'){
                    ans=a+b;
                }
                if(ch=='-'){
                    ans=a-b;
                }
                if(ch=='*'){
                    ans=a*b;
                }
                if(ch=='/'){
                    if(b!=0){
                        ans=a/b;
                    }
                }
                if(ch=='%'){
                    ans=a%b;
                }
            }
           else if(ch=='X' || ch=='x'){
                break;
            }
           else{
                System.out.println("Not Valid Operator Symbol");
            }
            System.out.println("the answer is : "+ans);
        }

    }
}
