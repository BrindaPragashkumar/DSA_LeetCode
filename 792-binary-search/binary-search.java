class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        while (left <= right){

            int mid = left + (right - left)/2;
// your are adding the new length to what is the start value then diving by 2 to get the mid 
            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid] < target){
                left = mid +1;
            }
            if (nums[mid]> target){
                 right = mid - 1;
            }
       }
       return -1;
    }
}  
  