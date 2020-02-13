class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        int dummy = 0;
        for(int i=arr.length-1;i>-1;i--)
        {
            dummy = arr[i];
            arr[i] = max;
            if(max<dummy)
                max = dummy;
        }
        return arr;
    }
}