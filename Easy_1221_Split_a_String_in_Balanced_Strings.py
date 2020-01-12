class Solution(object):
    def balancedStringSplit(self, s):
        """
        :type s: str
        :rtype: int
        """
        l,r,balance=0,0,0
        for character in s:
            if character=='L':
                l += 1
            elif character=='R':
                r += 1
            if l==r:
                balance += 1
                l=0
                r=0
        return balance;