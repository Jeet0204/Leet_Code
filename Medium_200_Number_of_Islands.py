class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        m = len(grid)
        n = len(grid[0])
        count=0
        for row in range(m):
            for col in range(n):
                if grid[row][col]=="1":
                    count+=1
                    dfs(grid,m,n,row,col)
                    
        return count
def dfs(grid,m,n,row,col):
    if(row<0 or col<0 or row>=m or col>=n or grid[row][col]=="0"):
        return
    
    grid[row][col]="0"
    dfs(grid,m,n,row+1,col)
    dfs(grid,m,n,row-1,col)
    dfs(grid,m,n,row,col+1)
    dfs(grid,m,n,row,col-1)
    
    return