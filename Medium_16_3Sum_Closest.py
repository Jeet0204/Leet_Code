class Solution(object):
    def threeSumClosest(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        nums.sort()
        Set = set()
        result = []
        for i in range(len(nums)):
            if(i>0 and nums[i]==nums[i-1]):
                continue
                
            j = i+1
            k = len(nums)-1
            
            while j<k:
                Set.add(nums[i]+nums[j]+nums[k])
                if(nums[i]+nums[j]+nums[k]==target):
                    return nums[i]+nums[j]+nums[k]
                elif(nums[i]+nums[j]+nums[k]<target):
                    j+=1
                else:
                    k-=1
        return min(sorted(Set), key=lambda x:abs(x-target))
                    