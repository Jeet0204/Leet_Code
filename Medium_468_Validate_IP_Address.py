class Solution(object):
    def validIPAddress(self, IP):
        """
        :type IP: str
        :rtype: str
        """
        strlen = len(IP)
        
        if(strlen<7 or strlen>39):
            return "Neither"
        elif((strlen>=7 and strlen<15) or (strlen==15 and "." in IP)):
            strsplit = []
            strsplit = IP.split(".")
            for num in strsplit:
                if(len(strsplit)==4 and str(num).isdigit() and int(num)>=0 and int(num)<=255 
                   and ((len(str(num))==1 and str(num)[0]=="0")
                   or (len(str(num)) - len(str(num).lstrip('0'))==0) )):
                    continue
                else:
                    return "Neither"
            return "IPv4"
        elif((strlen>15 and strlen<=39)  or (strlen==15 and ":" in IP)):
            strsplit = []
            strsplit = IP.split(":")
            for num in strsplit:
                if(len(strsplit)!=8 or len(str(num))>4):
                    return "Neither"
                elif(len(str(num))<=4 and len(str(num))>=1 and all(c in string.hexdigits for c in str(num))):
                    continue
                else:
                    return "Neither"
            return "IPv6"
        
        return "Neither"
        
            