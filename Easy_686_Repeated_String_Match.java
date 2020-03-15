class Solution {
    public int repeatedStringMatch(String A, String B) {
        String s = "";
        int count = 0;
        Set<Character> setA = new HashSet<>();
        Set<Character> setB = new HashSet<>();
        for(char i=0;i<A.length();i++)
        {
            if(!setA.contains(A.charAt(i)))
                setA.add(A.charAt(i));
        }
        for(char i=0;i<B.length();i++)
        {
            if(!setB.contains(B.charAt(i)))
                setB.add(B.charAt(i));
        }
        if(setA.containsAll(setB))
        {
            while(s.length()<3*Math.max(A.length(),B.length()))
            {
                if(s.contains(B))
                {
                    return count;
                }
                else
                {
                    s += A;
                }
                count++;
            }
            return -1;
        }
        else
        {
            return -1;
        }
        
    }
}