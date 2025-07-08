public class demo {
    public static void main(String[] args) {
      int a=10;
      int b=20;
      String name="Kunal";
        //block scope
        {
            //int a=78;//already initialized outside the block in the same method
            a=100;
            System.out.println(a);
            int c=99;
            name="Rahul";
            System.out.println(name);
            //values initialized in this block will remain in block
        }
        int c=100;
        System.out.println(a);
        System.out.println(name);
        //System.out.println(c);//cannot use outside the block

        //scoping in the loop
        for(int i=0;i<4;i++){
            System.out.println(i);
            int num=90;
            //int a=10;
        }

    }
    //method scope
    static void random(){
        int num=67;
        System.out.println((num));
    }
}
