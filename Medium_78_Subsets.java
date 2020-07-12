class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sub_list=new ArrayList<>();
        recr(list,sub_list, nums, 0);
        return list;
    }
    
    public void recr(List<List<Integer>> list,List<Integer> sub_list,int[] nums, int start)
    {
        list.add(new ArrayList<>(sub_list));
        for(int i=start;i<nums.length;i++)
        {
            sub_list.add(nums[i]);
            recr(list,sub_list,nums,i+1);
            sub_list.remove(sub_list.size()-1);
        }
    }
}