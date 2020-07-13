class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sub_list = new ArrayList<>();
        int sum=0;
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i] = i+1;
        }
        recr(list, sub_list, nums,k,0);
        return list;
    }
    
    public void recr(List<List<Integer>> list,  List<Integer> sub_list, int[] nums, int k, int start)
    {
        if(sub_list.size()==k)
            list.add(new ArrayList<>(sub_list));
        else
        {
            for(int i=start;i<nums.length;i++)
            {
                sub_list.add(nums[i]);
                recr(list, sub_list, nums, k, i+1);
                sub_list.remove(sub_list.size()-1);
            }
        }
    }
}