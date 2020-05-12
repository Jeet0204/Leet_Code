class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        boolean[][] visited = new boolean[image.length][image[0].length];
        int i=sr;
        int j=sc;
    
        return dfs(image,i,j,newColor,color, visited);
    }
    public int[][] dfs(int[][] image, int i, int j, int newColor, int color, boolean[][] visited)
    {
        if(i<0 || j>image[0].length-1 || i> image.length-1 || j<0 || image[i][j]!=color || visited[i][j]==true)
            return image;
        
        if(image[i][j]==color){
            image[i][j] = newColor;
            visited[i][j]=true;
        }
            
        
        dfs(image,i-1,j,newColor,color,visited);
        dfs(image,i,j+1,newColor,color,visited);
        dfs(image,i+1,j,newColor,color,visited);
        dfs(image,i,j-1,newColor,color,visited);
        
        return image;
    }
}