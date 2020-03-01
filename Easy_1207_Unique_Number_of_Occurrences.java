class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map= new HashMap<>();
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        for(int key:map.keySet())
        {
            if(set.contains(map.get(key)))
            {
                return false;
            }
            else
            {
                set.add(map.get(key));
            }
        }
        return true;
    }
}