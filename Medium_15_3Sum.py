class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        result = []
        for i in range(len(nums)):
            if i>0 and nums[i]==nums[i-1]:
                continue
            j=i+1
            k=len(nums)-1
            target = 0
            
            while(j<k):
                if(nums[i]+nums[j]+nums[k]==target):
                    result.append([nums[i],nums[j],nums[k]])
                    j=j+1
                    
                    while nums[j]==nums[j-1] and j<k:
                        j=j+1
                        
                elif(nums[i]+nums[j]+nums[k]<target):
                    j=j+1

                else:
                    k=k-1
                    
        return result
                    
                    