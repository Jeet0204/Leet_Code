class Solution {
    public int numTilePossibilities(String tiles) {
        if(tiles.length()==0)
            return 0;
        char[] ch = tiles.toCharArray();
        boolean[] visited = new boolean[tiles.length()];
        HashSet<String> set=new HashSet<String>();
        String unique="";
        dfs(ch,visited,set,unique);
        return set.size();
    }
    
    public void dfs(char[] ch, boolean[] visited,HashSet<String>set,String unique)
    {
        for(int i=0;i<ch.length;i++)
        {
            if(!visited[i])
            {
                visited[i] = true;
                set.add(unique+ch[i]);
                dfs(ch,visited,set,unique+ch[i]);
                visited[i] = false;
            }
        }
    }
}