import java.util.Scanner;
public class CaseCheck{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>=65 && ch<=90){
            System.out.println("Upper case: "+ch);
        }
        if(ch>=97 && ch<=122){
            System.out.println("Lower case: "+ch);
        }
    }
}
