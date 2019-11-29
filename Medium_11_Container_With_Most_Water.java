class Solution {
    public int maxArea(int[] height) {
        int capacity=0;
        int dummy=0;
        int i=0,j=height.length-1;
        while(i<j)
        {
            dummy = Math.min(height[i],height[j]);
            capacity = Math.max(capacity,dummy*(j-i));
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return capacity;
    }
}