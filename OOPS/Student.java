public class Student {
    int rno;
    String name;
    float marks=90.23f;
    //constructor
    Student(int roll,String naam,float mark){
        rno=roll;
        name=naam;
        marks=mark;
    }

    //creating constructor using this keyword
    Student(int rno,String name){
        this.rno=rno;
        this.name=name;
    }

    public static void main(String[] args) {
        Student student1=new Student(21,"kunal",32.53f);
        Student student2=new Student(22,"sam");
        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);

        System.out.println(student2.rno);
        System.out.println(student2.name);
    }
}
