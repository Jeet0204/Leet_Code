class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
        }
        
        List<Map.Entry<Character, Integer> > list = new LinkedList<Map.Entry<Character, Integer> >(map.entrySet()); 
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() { 
            public int compare(Map.Entry<Character, Integer> o1,  
                               Map.Entry<Character, Integer> o2) 
            { 
                return (o1.getValue()).compareTo(o2.getValue()); 
            } 
        }); 
        
        Collections.reverse(list);
        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>(); 
        for (Map.Entry<Character, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 

        String string= "";
        for (Map.Entry<Character,Integer> entry : temp.entrySet()) { 
            int count = entry.getValue();
                while(count>0){
                    string += entry.getKey();
                    count--;
                }
    } 
        
            return string;

    }
}