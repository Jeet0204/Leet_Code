class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String,Integer> map=new HashMap<String,Integer>();
        List<String> list=new ArrayList<String>();
        String[] string;
        int min=0;
        int max=0;
        for(int i=0;i<A.length();i++)
        {
            if(A.charAt(i)==' ')
            {
                max = i;
                map.put(A.substring(min,max),map.getOrDefault(A.substring(min,max),0)+1);
                min = i+1;
            }
            else if(i==A.length()-1)
            {
                max = i+1;
                map.put(A.substring(min,max),map.getOrDefault(A.substring(min,max),0)+1);
                min=0;
                max=0;
            }
            // System.out.print(map+"....."+i);
        }
        
        for(int i=0;i<B.length();i++)
        {
            if(B.charAt(i)==' '|| i==B.length())
            {
                max = i;
                map.put(B.substring(min,max),map.getOrDefault(B.substring(min,max),0)+1);
                min = i+1;
            }
             else if(i==B.length()-1)
            {
                max = i+1;
                map.put(B.substring(min,max),map.getOrDefault(B.substring(min,max),0)+1);
            }

        }
        
        for(Map.Entry entry: map.entrySet())
        {
            Integer one = 1;
            if(one.equals(entry.getValue()))
            {
                list.add(String.valueOf(entry.getKey()));   
            }                
        }
        
        string = new String[list.size()];
        for(int i=0;i<list.size();i++)
        {
            string[i] = list.get(i);
        }

        return string;
    }
}