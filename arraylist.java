import java.util.ArrayList;
import java.util.Scanner;
public class demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        /*list.add(23);
        list.add(54);
        list.add(29);
        list.add(85);
        list.add(74);
        list.add(75);

        System.out.println(list.contains(654));
        list.set(0,99);
        list.remove(2);*/

        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }

        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
        //System.out.println(list);

        //multi-dimensional array
        Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        //initialization
        for(int i=0;i<3;i++){
            arr.add(new ArrayList<>());
        }

        //add elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr.get(i).add(in.nextInt());
            }
        }
        System.out.println(arr);

    }
}
