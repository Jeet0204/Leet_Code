class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, newColor: int) -> List[List[int]]:
        m = len(image)
        n = len(image[0])
        x = image[sr][sc]
        visited = [[False]*n]* m
        dfs(image,sr,sc,m,n,newColor,x,visited)
        return image
def dfs(image, sr,sc,m,n,newColor,x,visited):
    if(sr<0 or sc<0 or sr>=m or sc>=n or (image[sr][sc]==newColor and visited[sr][sc])):
        return
    
    if image[sr][sc]==x: 
        image[sr][sc] = newColor
        visited[sr][sc] = True
        dfs(image,sr+1,sc,m,n,newColor,x,visited)
        dfs(image,sr-1,sc,m,n,newColor,x,visited)
        dfs(image,sr,sc+1,m,n,newColor,x,visited)
        dfs(image,sr,sc-1,m,n,newColor,x,visited)

    return 