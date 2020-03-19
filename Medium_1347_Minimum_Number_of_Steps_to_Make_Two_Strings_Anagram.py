class Solution(object):
    def minSteps(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: int
        """
        character= {}
        result = 0
        for i in s:
            if i not in character:
                character[i] = 1
            else:
                character[i] += 1
                
        for i in t:
            if i not in character:
                result += 1
            else:
                if character[i]>0:
                    character[i] -= 1
                else:
                    result += 1


        return result