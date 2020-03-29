class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map =new HashMap<>();
        int max=-1;
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        
        Iterator it = map.entrySet().iterator();
        
        while(it.hasNext())
        {
            Map.Entry pair = (Map.Entry)it.next();
            if(pair.getValue().equals((int)pair.getKey()))
            {
                max = (int)pair.getValue();
            }
        }
        return max;
    }
}