class Solution {
    public int peakIndexInMountainArray(int[] A) {
        
        if(A.length<3)
            return -1;
        
        int i=0;
        
        while(A[i]<A[i+1])
            i++;
        return i;
    }
}