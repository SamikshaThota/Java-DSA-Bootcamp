public class demo {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target=4;
        int ans=ceil(arr,target);
        System.out.println(ans);

        int ans2=floor(arr,target);
        System.out.println(ans2);

        char[] letter={'c','f','j'};
        char target1='a';
        char ans3=nextGreatestLetter(letter,target1);
        System.out.println(ans3);

        int target2 = 9;
        System.out.println(ans(arr, target2));

        int[] array={0,2,1,0};
        System.out.println(peak(array));

        int[] nums={1,2,3,5,3,1};
        int target5=3;
        System.out.println(found(nums,target5));

        int[] num1={4,5,6,7,0,1,2};
        int target6=0;
        System.out.println(targetFound(num1,target6));
    }
    //return the index of smallest number >= target
    static int ceil(int[] arr,int target) {
        if(target>arr[arr.length-1]){
            return -1;
        }
       int start=0;
       int end=arr.length-1;
       while(start<=end){
           int mid=start+(end-start)/2;
           if(target<arr[mid]){
               end=mid-1;
           }
           else if(target>arr[mid]){
               start=mid+1;
           }
           else{
               return mid;
           }
       }
       return start;
    }

    //return the greatest number <=target
    static int floor(int[] arr,int target){
        if(target<arr[0]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return end;
    }

    //find the smallest letter greater than target
    static char nextGreatestLetter(char[] letter,char target1){
        int start=0;
        int end=letter.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target1<letter[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return letter[start % letter.length];
    }

    //find the position of an element in a sorted array of infinite numbers.
    static int ans(int[] arr, int target2) {
        int start = 0;
        int end = 1;
        while (target2 > arr[end]) {
            int newstart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newstart;
        }
        return binarySearch(arr, target2, start, end);
    }

    static int binarySearch(int[] arr, int target2, int start, int end) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (target2 < arr[mid]) {
                end = mid - 1;
            } else if (target2 > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    //find the peak in the array
    static int peak(int[] array){
        int start=0;
        int end=array.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(array[mid]>array[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    //find in mountain array
    static int found(int[] nums,int target4){
        int peak=peakEle(nums);
        int IsFound=binArray(nums,target4,0,peak);
        if(IsFound!=-1){
            return IsFound;
        }
        else{
            return binArray(nums,target4,peak+1,nums.length-1);
        }
    }
    static int peakEle(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }

    static int binArray(int[] nums,int target3,int start,int end){
        boolean isAsc=nums[start]<nums[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target3==nums[mid]){
                return mid;
            }
            if (isAsc) {
                if(target3<nums[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target3>nums[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }

    //search in rotated array
    static int targetFound(int[] arr,int target4){
        int pivot=findPivot(arr);
        if(arr[pivot]==-1){
            return find(arr,target4,0,arr.length-1);
        }
        if(arr[pivot]==target4){
           return pivot;
        }
        if(target4>=arr[0]){
            return find(arr,target4,0,pivot);
        }
            return find(arr,target4,pivot+1,arr.length-1);
    }
    static int findPivot(int[] ar){
        int start=0;
        int end=ar.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && ar[mid]>ar[mid+1]){
                return mid;
            }
            if(mid>start && ar[mid]<ar[mid-1]){
                return mid-1;
            }
            if(ar[start]>=ar[end]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int find(int[] num,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<num[mid]){
                end=mid-1;
            }
            if(target>num[mid]){
                start=mid+1;
            }
            if(target==num[mid]){
                return mid;
            }
        }
        return -1;
    }
}
