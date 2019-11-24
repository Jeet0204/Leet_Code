class Solution {
    public int lengthOfLongestSubstring(String s) {
     Map<Character,Integer> map=new HashMap<>();
     List<Integer> list  =  new ArrayList<Integer>();
     list.add(0);
     
        
     for(int i=0;i<s.length();i++)
    {
         map.clear();
         map.put(s.charAt(i),1);
         for(int j=i+1;j<s.length();j++)
         {
             if(map.containsKey(s.charAt(j)))
             {
                 break;
             }
             else
             {
                map.put(s.charAt(j),1);
             }
         }
         list.add(map.size());  
    }
   return Collections.max(list);
     
    }
}