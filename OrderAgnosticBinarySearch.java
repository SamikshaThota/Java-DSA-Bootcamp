public class demo{
    public static void main(String[] args){
        int[] arr={112,95,34,23,17,12,9,1};
        //int[] arr={-1,-5,-8,0,5,12,74,75,63,99,122};
        int target=12;
        int ans=answer(arr,target);
        System.out.println(ans);
    }
    static int answer(int[] arr,int target) {
       int start=0;
       int end=arr.length-1;
       for(int i=0;i<arr.length;i++){
           boolean isAsc=arr[start]<arr[end];
           while(start<=end){
               int mid=start+(end-start)/2;

               if(arr[mid]==target){
                   return mid;
               }

               if(isAsc){
                   if(target<arr[mid]){
                       end=mid-1;
                   }
                   else{
                       start=mid+1;
                   }
               }
               else{
                   if(target>arr[mid]){
                       end=mid-1;
                   }else{
                       start=mid+1;
                   }
               }
           }

       }
       return -1;
    }
}
