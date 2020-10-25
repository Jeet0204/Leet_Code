class Solution:
    def numEnclaves(self, A: List[List[int]]) -> int:
        for row in range(len(A)):
            for col in range(len(A[0])):
                if(row == 0 or row == len(A)-1 or col == 0 or col ==len(A[0])-1):
                    if(A[row][col]==1):
                        dfs(A,len(A),len(A[0]),row,col)
        count = 0 
        for row in range(len(A)):
            for col in range(len(A[0])): 
                if(A[row][col]==1):
                    count += 1
                
                    
        return count
def dfs(board,rows,cols,row,col):
        if(row<0 or col<0 or row>=rows or col>=cols or board[row][col]==0 or board[row][col]==2):
            return
        
        board[row][col] = 2
        dfs(board,rows,cols,row+1,col)
        dfs(board,rows,cols,row-1,col)
        dfs(board,rows,cols,row,col+1)
        dfs(board,rows,cols,row,col-1)
        
        return