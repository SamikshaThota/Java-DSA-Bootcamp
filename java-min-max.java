public class demo{
    public static void main(String[] args){
       int[] arr={1,56,3,2,-4,15};
       int[] search=search(arr);
        System.out.println("Min: "+search[0]);
        System.out.println("Max: "+search[1]);
    }
    static int[] search(int[] arr){
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return new int[]{min,max};
    }
}
