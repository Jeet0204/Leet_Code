class Solution {
    public int[] decompressRLElist(int[] nums) {
        int j=0;
        int count=0;
        
        for(int i=0;i<nums.length;i=i+2)
        {
            count += nums[i];
        }
        
        int[] result = new int[count];
        count =0;
        for(int i=0;i<nums.length;i=i+2)
        {
            count = nums[i];
            while(count>0)
            {
                result[j] = nums[i+1];
                j++;
                count--;
            }
        }
        return result;
    }
}