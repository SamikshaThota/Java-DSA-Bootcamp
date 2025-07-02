import java.util.Scanner;
public class Demo{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String fruit=sc.next();
      switch(fruit){
          case "Mango"-> System.out.println("King of Fruits");
          case "Apple"->System.out.println("A Sweet red fruit");
          case "Orange"->System.out.println("Round fruit");
          case "Grapes"-> System.out.println("Small fruit");
          default->System.out.println("please enter a valid fruit");
      }
    }
}
