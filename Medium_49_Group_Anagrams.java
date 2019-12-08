class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> map = new HashMap<String,List>();
        List<List<String>> list =new ArrayList<List<String>>();
        
        for(int i=0;i<strs.length;i++)
        {
            List<String> list1 = new ArrayList<String>();
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            list1.add(strs[i]);
            if(!map.containsKey(String.valueOf(ch)))
            {
                map.put(String.valueOf(ch),list1);
            }
            else
            {
                map.get(String.valueOf(ch)).add(strs[i]);
            }
        }
        
        for(String key:map.keySet())
        {
            list.add(map.get(key));
        }

        return list;
    }
}