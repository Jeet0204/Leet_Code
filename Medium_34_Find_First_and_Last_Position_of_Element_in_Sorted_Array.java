class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
        result[0] = -1;
        result[1] = -1;
        binarySearch(nums,0,nums.length-1,target,result);
        return result;
    }
    
    public void binarySearch(int[] nums,int start,int end,int target,int[] result)
    {
        int mid = (start+end)/2;
        
        if(end<start)
            return;
        if(nums[start]==nums[end] && nums[start]==target)
        {
            result[0] = start;
            result[1] = end;
        }
        
        
        
                 
        if(nums[mid]<target)
            binarySearch(nums,mid+1,end,target,result);
        else if(nums[mid]>target)
            binarySearch(nums,start,mid-1,target,result);
        else
        {
            result[0] = mid;
            result[1] = mid;
            
            int temp = mid;
            while(temp>start && nums[temp]==nums[temp-1])
            {
                temp--;
                result[0] = temp; 
            }
            int temp1 = mid;
            while(temp1<end && nums[temp1]==nums[temp1+1])
            {
                temp1++;
                result[1] = temp1;
            }
           
        }
    }
}