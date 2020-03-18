class Solution(object):
    def groupThePeople(self, groupSizes):
        """
        :type groupSizes: List[int]
        :rtype: List[List[int]]
        """
        myDict = {}
        result=[]
       
        for i in range(len(groupSizes)):
                myDict.setdefault(groupSizes[i], [])
                myDict[groupSizes[i]].append(i)
               
        for i in myDict:  
            while bool(myDict[i]):
                result.append(myDict[i][0:i])
                del myDict[i][0:i]
               
        return result