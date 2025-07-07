import java.util.Scanner;
public class GeometricCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Geometric Calculator");
        System.out.println("Choose what you want to calculate");
        System.out.println("1.Area");
        System.out.println("2.Perimeter");
        System.out.println("3.Volume");
        System.out.println("4.Surface Area");
        System.out.println("5.Exit");
        System.out.println("Choose the number(1 to 5): ");
        int choose=sc.nextInt();

        switch(choose){
            case 1 -> {
                System.out.println("\nChoose the Shape to Calculate Area");
                System.out.println("1.Circle");
                System.out.println("2.Triangle");
                System.out.println("3.Rectangle");
                System.out.println("4.Isosceles Triangle");
                System.out.println("5.Parallelogram");
                System.out.println("6.Rhombus");
                System.out.println("7.Equilateral Triangle");
                System.out.println("Choose one number among these: ");
                int chooseShape=sc.nextInt();
                switch(chooseShape){
                    case 1->{
                        System.out.println("Area of Circle: ");
                        System.out.println("Enter the value of c_radius: ");
                        double c_radius=sc.nextDouble();
                        double c_area=Math.PI*c_radius*c_radius;
                        System.out.printf("Area of Circle: %.2f\n",c_area);
                    }
                    case 2->{
                        System.out.println("Area of triangle: ");
                        System.out.println("enter the value of base: ");
                        double base=sc.nextDouble();
                        System.out.println("enter the value of height: ");
                        double height=sc.nextDouble();
                        double t_area=0.5*base*height;
                        System.out.printf("Area of Triangle: %.2f\n",t_area);
                    }
                    case 3->{
                        System.out.println("Area of Rectangle: ");
                        System.out.println("enter the value of length: ");
                        double length=sc.nextDouble();
                        System.out.println("enter the value of breadth: ");
                        double breadth=sc.nextDouble();
                        double r_area=length*breadth;
                        System.out.printf("Area of Rectangle: %.2f\n",r_area);
                    }
                    case 4->{
                        System.out.println("Area of Isosceles Triangle: ");
                        System.out.println("enter the value of base: ");
                        double base=sc.nextDouble();
                        System.out.println("enter the value of height: ");
                        double height=sc.nextDouble();
                        double IsT_area=0.5*base*height;
                        System.out.printf("Area of Isosceles Triangle: %.2f\n",IsT_area);
                    }
                    case 5->{
                        System.out.println("Area of Parallelogram: ");
                        System.out.println("enter the value of base: ");
                        double base=sc.nextDouble();
                        System.out.println("enter the value of height: ");
                        double height=sc.nextDouble();
                        double p_area=base*height;
                        System.out.printf("Area of Parallelogram: %.2f\n",p_area);
                    }
                    case 6->{
                        System.out.println("Area of Rhombus: ");
                        System.out.println("enter the value of d1: ");
                        double d1=sc.nextDouble();
                        System.out.println("enter the value of d2: ");
                        double d2=sc.nextDouble();
                        double rh_area=(d1*d2)/2;
                        System.out.printf("Area of Rhombus: %.2f\n",rh_area);
                    }
                    case 7->{
                        System.out.println("Area of Equilateral Triangle: ");
                        System.out.println("enter the value of side: ");
                        double side=sc.nextDouble();
                        double et_area=(Math.sqrt(3)/4)*side*side;
                        System.out.printf("Area of Equilateral Triangle: %.2f\n",et_area);
                    }
                    default -> System.out.println("wrong input");

                }
                return;
            }
            case 2->{
                System.out.println("choose the shape to calculate Perimeter");
                System.out.println("1.Circle");
                System.out.println("2.Equilateral Triangle");
                System.out.println("3.Parallelogram");
                System.out.println("4.Rectangle");
                System.out.println("5.Square");
                System.out.println("6.Rhombus");
                System.out.println("choose a number(1 to 6): ");
                int ChooseShape=sc.nextInt();
                switch(ChooseShape){
                    case 1->{
                        System.out.println("Perimeter of Circle");
                        System.out.println("enter the radius of circle: ");
                        double radius=sc.nextDouble();
                        double c_perimeter=2*Math.PI*radius;
                        System.out.printf("Perimeter of circle: %.2f\n",c_perimeter);
                    }
                    case 2->{
                        System.out.println("Perimeter of Equilateral Triangle: ");
                        System.out.println("enter the value of side: ");
                        double side=sc.nextDouble();
                        double et_perimeter=3*side;
                        System.out.printf("Perimeter of Equilateral Triangle: %.2f\n",et_perimeter);
                    }
                    case 3->{
                        System.out.println("Perimeter of Parallelogram: ");
                        System.out.println("Enter the value of base: ");
                        double base=sc.nextDouble();
                        System.out.println("enter the value of side: ");
                        double p_side=sc.nextDouble();
                        double p_perimeter=2*(base+p_side);
                        System.out.printf("Perimeter of Parallelogram: %.2f\n",p_perimeter);
                    }
                    case 4->{
                        System.out.println("Perimeter of Rectangle: ");
                        System.out.println("enter the value of length: ");
                        double length=sc.nextDouble();
                        System.out.println("enter the value of breadth: ");
                        double breadth=sc.nextDouble();
                        double r_perimeter=2*(length+breadth);
                        System.out.printf("Perimeter of Rectangle: %.2f\n",r_perimeter);
                    }
                    case 5->{
                        System.out.println("Perimeter of square: ");
                        System.out.println("enter the value of side: ");
                        double s_side=sc.nextDouble();
                        double s_perimeter=4*s_side;
                        System.out.printf("Perimeter of square: %.2f\n",s_perimeter);
                    }
                    case 6->{
                        System.out.println("Perimeter of Rhombus: ");
                        System.out.println("enter the value of side: ");
                        double rh_side=sc.nextDouble();
                        double rh_perimeter=4*rh_side;
                        System.out.printf("Perimeter of Rhombus: %.2f\n",rh_perimeter);
                    }
                    default -> System.out.println("wrong input");
                }
                return;
            }
            case 3->{
                System.out.println("Enter the shape to calculate Volume");
                System.out.println("1.cone");
                System.out.println("2.prism");
                System.out.println("3.cylinder");
                System.out.println("4.Sphere");
                System.out.println("5.pyramid");
                System.out.println("choose one number(1 to 5): ");
                int ChooseShape=sc.nextInt();
                switch(ChooseShape){
                    case 1->{
                        System.out.println("Volume of Cone: ");
                        System.out.println("enter the value of r: ");
                        double r=sc.nextDouble();
                        System.out.println("enter the value of h: ");
                        double h=sc.nextDouble();
                        double cone_volume=(1.0/3)*Math.PI*r*r*h;
                        System.out.printf("Volume of Cone: %.2f\n",cone_volume);
                    }
                    case 2->{
                        System.out.println("Volume of Prism: ");
                        System.out.println("Enter the BaseArea: ");
                        double BaseArea=sc.nextDouble();
                        System.out.println("enter the height: ");
                        double height=sc.nextDouble();
                        double prism_volume=BaseArea*height;
                        System.out.printf("Volume of Prism: %.2f\n",prism_volume);
                    }
                    case 3->{
                        System.out.println("Volume of Cylinder");
                        System.out.println("Enter the value of r: ");
                        double r=sc.nextDouble();
                        System.out.println("Enter the value of h: ");
                        double h=sc.nextDouble();
                        double cylinder_volume=Math.PI*r*r*h;
                        System.out.printf("Volume of Cylinder: %.2f\n",cylinder_volume);
                    }
                    case 4->{
                        System.out.println("Volume of Sphere:");
                        System.out.println("Enter the value of r: ");
                        double r=sc.nextDouble();
                        double sphere_volume=(4.0/3)*Math.PI*r*r*r;
                        System.out.printf("Volume of Sphere: %.2f\n",sphere_volume);
                    }
                    case 5->{
                        System.out.println("Volume of Pyramid");
                        System.out.println("enter the value of BaseArea: ");
                        double BaseArea=sc.nextDouble();
                        System.out.println("enter the value of height: ");
                        double height=sc.nextDouble();
                        double pyramid_volume=(1.0/3)*BaseArea*height;
                        System.out.printf("Volume of Pyramid: %.2f\n",pyramid_volume);
                    }
                    default -> System.out.println("wrong shape");
                }
                return;
            }
            case 4->{
                System.out.println("Select the shape to calculate Surface Area");
                System.out.println("1.Curved Surface Area of Cylinder");
                System.out.println("2.Total Surface Area of Cube");
                System.out.println("choose a number(1 or 2): ");
                int ChooseShape=sc.nextInt();
                switch(ChooseShape){
                    case 1->{
                        System.out.println("Curved Surface Area of Cylinder");
                        System.out.println("enter the value of r: ");
                        double r=sc.nextDouble();
                        System.out.println("enter the value of h: ");
                        double h=sc.nextDouble();
                        double csa=2*Math.PI*r*h;
                        System.out.printf("Curved Surface Area of Cylinder: %.2f\n",csa);
                    }
                    case 2->{
                        System.out.println("Total Surface Area of Cube");
                        System.out.println("enter the value of side: ");
                        double side=sc.nextDouble();
                        double tsa=6*side*side;
                        System.out.printf("Total Surface Area of Cube: %.2f\n",tsa);
                    }
                    default -> System.out.println("wrong shape");
                }
                return;
            }
            case 5->{
                System.out.println("Thank you for Visiting...");
                System.out.println("Exiting");
                sc.close();
                return;
            }
            default -> System.out.println("wrong Input");
        }
    }
}
