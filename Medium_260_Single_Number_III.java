class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++)
        {
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        Iterator it = map.entrySet().iterator();
        int i=0;

        while (it.hasNext()) 
        {
            Map.Entry pair = (Map.Entry)it.next();
            if(pair.getValue().equals(1))
            {
                result[i] = (int)pair.getKey();
                i++;
            }
        }
            return result;
    }
}