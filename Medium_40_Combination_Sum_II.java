class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int sum=0;
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sub_list=new ArrayList<>();
        recr(list,sub_list, candidates, sum,target,0);
        return list;
    }
    
    public void recr(List<List<Integer>> list,List<Integer> sub_list,int[] nums, int sum, int target,int start)
    {
        if(sum==target && !list.contains(sub_list))
        {
            list.add(new ArrayList<>(sub_list));
           
        }
        else if(sum>target)
            return;
        else
        {
            for(int i=start;i<nums.length;i++)
            {
              
                sub_list.add(nums[i]);
                recr(list,sub_list,nums,sum+nums[i], target,i+1);
                sub_list.remove(sub_list.size()-1);
            }
        }
    }
}