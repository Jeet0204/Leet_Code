class Solution {
    public List<Integer> partitionLabels(String S) {
        int[] c = new int[26];
        List<Integer> list = new ArrayList<>();
        int j =0, visited=0;
        for(int i=0;i<S.length();i++)
        {
            c[S.charAt(i)-'a'] = i;
        }
        
        for(int i=0;i<S.length();i++)
        {
            j = Math.max(j,c[S.charAt(i)-'a']);
            if(j==i)
            {
                list.add(j+1-visited);
                visited = j+1;
                
            }
        }
        
        return list;
    }
}