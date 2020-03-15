class Solution(object):
    def repeatedStringMatch(self, A, B):
        """
        :type A: str
        :type B: str
        :rtype: int
        """
        count = 0
        res = ""
        while len(res) <= 3*max(len(B),len(A)):
            if(B in res):
                return count
            else:
                res += A
            count += 1
        return -1