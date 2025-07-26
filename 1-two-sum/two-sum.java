class Solution {
    public int[] twoSum(int[] nums, int target) {
        int x = nums.length;
        int[] result = {0,0};
        for(int i = 0; i<x-1; i++){
            for(int j = i+1 ; j<x; j++){
                if(nums[i]+ nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
        
    }
}