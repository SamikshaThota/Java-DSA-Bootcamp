import java.util.Arrays;
import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        //int[] arr1={1,2,3,4,5,6,7};
        //System.out.println(arr[0]);
        //String[] name=new String[5];
        //System.out.println(name[0]);
        arr[0]=23;
        arr[1]=45;
        arr[2]=65;
        arr[3]=25;
        arr[4]=12;
        System.out.println(arr[1]);

        //input using the loops
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        //printing using fo-loop
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
        //printing using for-each loop
        for(int num:arr){
            System.out.print(num+" ");
        }

        //printing using to-string method
        System.out.println(Arrays.toString(arr));

        //array of objects
        String[] st=new String[4];
        for(int i=0;i<st.length;i++){
            st[i]=sc.next();
        }
        System.out.println(Arrays.toString(st));

        String[] str=new String[4];
        str[0]="Samiksha";
        str[1]="Sameer";
        str[2]="Sam";
        str[3]="tom";
        System.out.println(Arrays.toString(str));
        str[2]="tom";
        System.out.println(Arrays.toString(str));

        int[] rolls={1,2,3,4,5};
        System.out.println(Arrays.toString(rolls));
        change(rolls);
        System.out.println(Arrays.toString(rolls));

        //Multi-dimensional arrays
        //int[][] ar=new int[3][3];
        int[][] ar={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] arr2d={
                {1,2,3},//0th index
                {4, 5},//1st index
                {6,7,8,9}//2nd index
        };

        //input
        Scanner in=new Scanner(System.in);
        int[][] array= new int[3][2];
        for(int row=0;row<array.length;row++){
            for(int col=0;col< array[row].length;col++){
                array[row][col]=in.nextInt();
            }
        }
        
        for(int row=0;row<array.length;row++){
            for(int col=0;col< array[row].length;col++){
                System.out.println(array[row][col]+" ");
            }
            System.out.println();
        }
        
        for(int[] a:array){
            System.out.println(Arrays.toString(a));
        }

        for(int row=0;row<array.length;row++){
            System.out.println(Arrays.toString(array[row]));
        }
        
        //Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row you want?");
        int r_length=sc.nextInt();
        int[][] Arr=new int[r_length][];

        for(int i=0;i<Arr.length;i++){
            System.out.println("Enter the number of coluum you need in each row?");
            System.out.println("the column size at row number"+i+": ");
            int col_length=sc.nextInt();
            Arr[i]=new int[col_length];
        }

        for(int i=0;i< Arr.length;i++){
            for(int j=0;j<Arr[i].length;j++){
                Arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i< Arr.length;i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.print(Arr[i][j]);
            }
            System.out.println();
        }
    }
    static void change(int[] arr){
        arr[0]=99;
    }


}
