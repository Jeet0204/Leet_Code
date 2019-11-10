class Solution {
    public boolean rotateString(String A, String B) {
        if(A.length()!=B.length())
            return false;
        
        String C = A + A;
        System.out.print(C);
        
        if(C.contains(B))
            return true;
        
//Horspool Algorithm
//         char []l1 = C.toCharArray();
//         char []l2 = B.toCharArray();
//         int []table = new int[500];
//         int len = B.length();
        
//         for(int i=0;i<C.length();i++)
//             table[i] = len;
//         for(int i=0;i<len-1;i++)
//             table[l2[i]] = len-1-i;
        
//         for(int i= len-1;i<C.length();)
//         {
//             int j=0;
//             while((j<len-1) && (l2[len-1-j]==l1[i-j]))
//                 j++;
//             if(j==len)
//             {
//                 System.out.print("In");
//                 return true;
//             }
//             else
//             {
//                 i +=  table[l1[i]];
//             }
//         }
        
        return false;
    }
}