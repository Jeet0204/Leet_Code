class Solution {
    public int numTrees(int n) {
        int[] unique_bst = new int[n+1];
        unique_bst[0] = 1;
        unique_bst[1] = 1;
        for(int i=2;i<n+1;i++)
        {
            for(int j=0;j<i;j++)
                unique_bst[i] = unique_bst[i] + unique_bst[j]*unique_bst[i-j-1];
        }
        return unique_bst[n];
    }
}