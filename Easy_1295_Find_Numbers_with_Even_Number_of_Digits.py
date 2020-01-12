class Solution(object):
    def findNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        result = 0
        for x in nums:
            count = 0
            while x>0:
                x = x/10
                count += 1
                
            if count%2==0:
                result += 1
                
        return result