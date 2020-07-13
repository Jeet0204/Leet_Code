class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int sum=0;
        int[] candidates = new int[]{1,2,3,4,5,6,7,8,9};
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sub_list=new ArrayList<>();
        recr(list,sub_list, candidates, sum,n,0,k);
        return list;
    }
    
    public void recr(List<List<Integer>> list,List<Integer> sub_list,int[] nums, int sum, int target,int start,int size)
    {
        if(sum==target && !list.contains(sub_list) && sub_list.size()==size)
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
                recr(list,sub_list,nums,sum+nums[i], target,i+1,size);
                sub_list.remove(sub_list.size()-1);
            }
        }
    }
}