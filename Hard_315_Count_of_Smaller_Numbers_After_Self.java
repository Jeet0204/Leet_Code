class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            count=0;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                    count++;
            }
            list.add(count);
        }
        return list;
    }
}