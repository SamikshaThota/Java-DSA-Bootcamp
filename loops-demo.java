import java.util.Scanner;
public class LoopsDemo{
    public static void main(String[] args) {
        //for loop
        //print numbers from 1 to 5
        for(int num=1;num<=5;num+=1){
            System.out.println(num);
        }

        //print numbers from 1 to n
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n: ");
        int n=sc.nextInt();
        for(int num=1;num<=n;num++){
            System.out.println(num);
        }

        //while loop
        System.out.println("printing 1 to 5 using while loop: ");
        int i=1;
        while(i<=5){
            System.out.println(i);
            i++;
        }

        //do-while
        System.out.println("Printing using do-while loop: ");
        int number=1;
        do{
            System.out.println(number);
            number++;
        }while(number<=5);
    }
}
