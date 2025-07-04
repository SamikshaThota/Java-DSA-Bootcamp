import java.util.Scanner;
public class Demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Area of Circle: ");
        System.out.println("Enter the value of c_radius: ");
        double c_radius=sc.nextDouble();
        double c_area=Math.PI*c_radius*c_radius;
        System.out.printf("Area of Circle: %.2f",c_area);
        System.out.println();

        System.out.println("=================================================");

        System.out.println("Area of triangle: ");
        System.out.println("enter the value of base: ");
        double base=sc.nextDouble();
        System.out.println("enter the value of height: ");
        double height=sc.nextDouble();
        double t_area=0.5*base*height;
        System.out.printf("Area of Triangle: %.2f ",t_area);
        System.out.println();

        System.out.println("===================================================");
        System.out.println("Area of Rectangle: ");
        System.out.println("enter the value of length: ");
        double length=sc.nextDouble();
        System.out.println("enter the value of breadth: ");
        double breadth=sc.nextDouble();
        double r_area=length*breadth;
        System.out.printf("Area of Rectangle: %.2f ",r_area);
        System.out.println();

        System.out.println("===================================================");

        System.out.println("Area of Isosceles Triangle: ");
        double IsT_area=0.5*base*height;
        System.out.printf("Area of Isosceles Triangle: %.2f",IsT_area);
        System.out.println();

        System.out.println("====================================================");

        System.out.println("Area of Parallelogram: ");
        double p_area=base*height;
        System.out.printf("Area of Parallelogram: %.2f",p_area);
        System.out.println();

        System.out.println("======================================================");

        System.out.println("Area of Rhombus: ");
        System.out.println("enter the value of d1: ");
        double d1=sc.nextDouble();
        System.out.println("enter the value of d2: ");
        double d2=sc.nextDouble();
        double rh_area=(d1*d2)/2;
        System.out.printf("Area of Rhombus: %.2f",rh_area);
        System.out.println();

        System.out.println("======================================================");

        System.out.println("Area of Equilateral Triangle: ");
        System.out.println("enter the value of side: ");
        double side=sc.nextDouble();
        double et_area=(Math.sqrt(3)/4)*side*side;
        System.out.printf("Area of Equilateral Triangle: %.2f",et_area);
        System.out.println();
    }
}
