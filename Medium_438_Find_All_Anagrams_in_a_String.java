class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] pfreq = new int[26];
        List<Integer> list = new ArrayList<>();
        
        if((s.length()==1 && p.length()==0) || (s.length()==0 && p.length()==1) || (s.length()==0 && p.length()==0))
            return list;
        
        for(int i=0;i<p.length();i++)
            pfreq[p.charAt(i)-'a']++;

        for(int i=0;i<=s.length()-p.length();i++)
        {          
            
            char[] ch1= s.substring(i,i+p.length()).toCharArray();
            int[] sfreq = new int[26];
            
            for(int j=0;j<ch1.length;j++)
                sfreq[ch1[j]-'a']++;
            
            if(Arrays.equals(pfreq,sfreq))
                list.add(i);   
        }
        return list;
    }
}