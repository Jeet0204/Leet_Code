class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
         if(nums.length==0)
            return new int[0];
        
        int[] result = new int[nums.length-k+1];           
        for(int i=0;i<nums.length-k+1;i++)
        {
            int[] max = new int[k];
            for(int j=0;j<k;j++)
            {
                max[j] = nums[j+i];
            }
            result[i] = Arrays.stream(max).max().getAsInt(); 
        }
        return result;
    }
}