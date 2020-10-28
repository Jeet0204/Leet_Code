from collections import deque
class Solution:
    def maxDistance(self, grid: List[List[int]]) -> int:
        visited = set()
        tracker = []
        m = len(grid)
        n = len(grid[0])
        deq = deque()
        for row in range(m):
            for col in range(n):
                if(grid[row][col]==1):
                    visited.add((row,col))
                    deq.append((row,col))
        
        while deq:
            x,y = deq.popleft()

            for i,j in [(1,0),(-1,0),(0,1),(0,-1)]:
                x_update, y_update = x+i,y+j
                if(x_update>=0 and y_update>=0 and x_update<m and y_update<n and (x_update, y_update) not in visited):
                    visited.add((x_update,y_update))
                    deq.append((x_update,y_update))
                    tracker.append(grid[x][y]+1)
                    grid[x_update][y_update] = grid[x][y]+1
                    
        if len(tracker)==0:
            return -1
        else:
            return max(tracker)-1
          