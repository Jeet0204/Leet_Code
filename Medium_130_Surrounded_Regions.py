class Solution:
    

    def solve(self, board: List[List[str]]) -> None:
        """
        Do not return anything, modify board in-place instead.
        """
        for row in range(len(board)):
            for col in range(len(board[0])):
                if(row == 0 or row == len(board)-1 or col == 0 or col ==len(board[0])-1):
                    if(board[row][col]=="O"):
                        dfs(board,len(board),len(board[0]),row,col)
                        
        for row in range(len(board)):
            for col in range(len(board[0])): 
                if(board[row][col]=="O"):
                    board[row][col] = "X"
                if(board[row][col]=="$"):
                    board[row][col] = "O"
                    
        return board
def dfs(board,rows,cols,row,col):
        if(row<0 or col<0 or row>=rows or col>=cols or board[row][col]=="X" or board[row][col]=="$"):
            return
        
        board[row][col] = "$"
        dfs(board,rows,cols,row+1,col)
        dfs(board,rows,cols,row-1,col)
        dfs(board,rows,cols,row,col+1)
        dfs(board,rows,cols,row,col-1)
        
        return
                        
        