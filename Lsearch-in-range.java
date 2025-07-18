public class SearchInRange{
    public static void main(String[] args){
        int[] num={1,2,3,4,5,6,7};
        int target=5;
        int ans=linearsearch(num,target,1,4);
        System.out.println(ans);

    }
    static int linearsearch(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int index=start;index<=end;index++){
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
