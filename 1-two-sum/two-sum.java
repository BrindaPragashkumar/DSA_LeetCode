import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<= nums.length; i++){
            int reminder = target - nums[i];
            if(map.containsKey(reminder)){
                return new int[] {map.get(reminder),i};
            }
            map.put(nums[i],i);
        
        }
        return new int []{};        
    }
}