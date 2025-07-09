import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean result=isPrime(n);
        System.out.println(result);
        
        
        for(int i=100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }

    }
    //print all the three digit armstrong number
    static boolean isArmstrong(int n) {
        int digits = 0;
        int temp = n;
        while (temp != 0) {
            int rev = temp % 10;
            digits++;
            temp = temp / 10;
        }
        temp = n;
        int sum = 0;
        while (temp != 0) {
            int rev = temp % 10;
            sum += (int) Math.pow(rev, digits);
            temp = temp / 10;
        }
        return n==sum;
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}
