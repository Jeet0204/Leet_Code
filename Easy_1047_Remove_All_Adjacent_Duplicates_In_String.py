class Solution(object):
    def removeDuplicates(self, S):
        """
        :type S: str
        :rtype: str
        """
        stack = []
        string = ""
        print('In stack: ',stack)
        for char in S:
            if(len(stack)==0 or char!=stack[-1]):
                stack.append(char)
            else:
                stack.append(char)
                stack.pop()
                stack.pop()
                
        while len(stack)!=0:
            string += stack.pop()
            
        return string[len(string)::-1]
            
