class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        
        
        for(String word: words)
        {
            boolean flag= false;
            HashMap<Character,Character> map = new HashMap<>();
            HashMap<Character,Character> map1 = new HashMap<>();
            for(int i=0;i<word.length();i++)
            {
                if(!map.containsKey(pattern.charAt(i)))
                    map.put(pattern.charAt(i),word.charAt(i));
                if(!map1.containsKey(word.charAt(i)))
                    map1.put(word.charAt(i),pattern.charAt(i));
                if(map1.get(word.charAt(i))!=pattern.charAt(i) || map.get(pattern.charAt(i))!=word.charAt(i))
                    flag = true;

            }  
            if(flag==false)
                list.add(word);
        }
        return list;
    }
}