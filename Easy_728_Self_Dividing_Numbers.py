class Solution(object):
    def selfDividingNumbers(self, left, right):
        """
        :type left: int
        :type right: int
        :rtype: List[int]
        """
        result=[]
        while(left<=right):
            for i in str(left):
                if(int(i)==0 or left%int(i)!=0):
                    break
            else:
                result.append(left)
            left += 1
               
        return result   