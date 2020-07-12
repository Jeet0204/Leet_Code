class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> list = new ArrayList<>();
        List<Integer> sub_list=new ArrayList<>();
        recr(list,sub_list, nums);
        return list;
    }
    
    public void recr(List<List<Integer>> list,List<Integer> sub_list,int[] nums)
    {
        if(nums.length==sub_list.size())
            list.add(new ArrayList<>(sub_list));
        else
        {
           for(int i=0;i<nums.length;i++)
            {
                if(sub_list.contains(nums[i]))
                    continue;
                sub_list.add(nums[i]);
                recr(list,sub_list,nums);
                sub_list.remove(sub_list.size()-1);
            }   
        }
    }
}