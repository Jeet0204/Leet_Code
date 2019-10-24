class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap();
        List list =new ArrayList();
        for(int i=0; i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else
            {
                hm.put(nums[i],1);
            }
            System.out.println(hm);
           
        }
        
         for(Integer key: hm.keySet())
            {
                if(hm.get(key) > nums.length/3)
                {
                    list.add(key);
                }
                
                    
            }
        return list;
    }
}