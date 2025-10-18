class Solution(object):
    def searchRange(self, nums, target):
        for i in range(len(nums)):
            if nums[i] == target:
                start = i
                while i+1 < len(nums) and nums[i+1] == target:
                    i = i+1
                return [start,i]
        return [-1,-1]


        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        