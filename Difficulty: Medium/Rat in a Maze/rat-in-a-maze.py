class Solution:
    
    directions={
        "D":(1,0),
        "L":(0,-1),
        "R":(0,1),
        "U":(-1,0)
    }
    
    def solve(self,maze,path,res,i,j):
        n=len(maze)
        if i==n-1 and j==n-1:
            res.append("".join(path))
            return
        maze[i][j]=2
        for key,value in Solution.directions.items():
            x,y=i+value[0],j+value[1]
            if 0<=x<n and 0<=y<n and maze[x][y]==1:
                path.append(key)
                self.solve(maze,path,res,x,y)
                path.pop()
        maze[i][j]=1

    def ratInMaze(self, maze):
        n=len(maze)
        if maze[0][0]==0 or maze[n-1][n-1]==0:
            return []
        res=[]
        self.solve(maze,[],res,0,0)
        return res