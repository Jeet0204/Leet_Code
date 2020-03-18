class Solution(object):
    def maxIncreaseKeepingSkyline(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        max_row = []
        max_col = []
        result = 0
        
        for r in grid:
            row=0
            for element in r:
                row = max(row,element)
            max_row.append(row)
        
        for c in zip(*grid):
            col=0
            for element in c:
                col = max(col,element)
            max_col.append(col)
        
        row = 0
        for r in grid:
            col = 0
            for element in r:
                temp = grid[row][col]
                grid[row][col] = max(min(max_row[row],max_col[col]),grid[row][col])
                result = result + max(grid[row][col],temp) - temp
                col += 1
            row += 1
            
        return result