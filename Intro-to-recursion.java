
public class demo {
    public static void main(String[] args) {
        //System.out.println(fibSeries(5));
        int[] arr={1,2,3,4,45,87};
        int target=45;
        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }
    //fibonacci series using recursion
    static int fibSeries(int n) {
        if(n>2){
            return n;
        }
        return fibSeries(n-1)+fibSeries(n-2);
    }
    //binary search using recursion
    static int binarySearch(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return binarySearch(arr,target,start,mid-1);
        }
        return binarySearch(arr,target,mid+1,end);
    }
}
