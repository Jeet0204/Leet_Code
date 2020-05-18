class Solution(object):
    def checkInclusion(self, s1, s2):
        """
        :type s1: str
        :type s2: str
        :rtype: bool
        """
        list_s1 = [0]*26
        
        for i in s1:
            list_s1[ord(i)-ord('a')]+=1

        for i in range(len(s2) - len(s1)+1):
            list_s2 = [0]*26
            for j in s2[i:i+len(s1)]:
                
                list_s2[ord(j)-ord('a')]+=1
                if list_s2 == list_s1:
                    return True
        return False