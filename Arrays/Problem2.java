// There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length) such that  the  resulting  array  is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ...,nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.You must write an algorithm with O(log n) runtime complexity.

public class Problem2 {
    public static int solution(int nums[], int target){
        int start = 0, end = nums.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[start] <= nums[mid]){
                if(target >= nums[start] && target < nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target > nums[mid] && target <= nums[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }  
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {4,  5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println("The target is at index : "+solution(nums,target));
    }
}
