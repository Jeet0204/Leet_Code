class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
       
        int median=0, result=0;
        median = nums[nums.length/2];
        for(int i=0;i<nums.length;i++)
        {
            result += Math.abs(nums[i]-median);
        }
        return result;
    }
}