class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm =new HashMap();
        int max_value = 0, max_key=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
            
            for (Integer key: hm.keySet())
            {
                if(hm.get(key) > max_value)
                {
                    max_value = hm.get(key);
                    max_key = key;
                }
            }
            

        }
        
        return max_key;
    }
}
