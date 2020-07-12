class Solution {
    public boolean buddyStrings(String A, String B) {
        Set<Character> set = new HashSet<>();
        Set<Character> set1 = new HashSet<>();
        int[] index = new int[2]; 
        int j=0, count =0;
        
        if(A.length()!=B.length() || (A.length()==0 && B.length()==0))
           return false;
      
        
        for(int i=0;i<A.length();i++)
        {
            set.add(A.charAt(i));
            set1.add(B.charAt(i));
            if(A.charAt(i)!=B.charAt(i) && j<2)
            {
                index[j] = i;
                j++;
                count++;
            }
            else if(A.charAt(i)!=B.charAt(i))
                count++;
        }
        if(A.length()>set.size() && A.equals(B))
            return true;
        if(A.charAt(index[0])==B.charAt(index[1]) && A.charAt(index[1])==B.charAt(index[0]) 
           && j==2 && count==2)
            return true;
        
      return false;
    }
}