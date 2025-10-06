class Solution:
    def knightTour(self, n):
# Possible knight moves (8 directions)
        directions = [
            (2, 1), (1, 2), (-1, 2), (-2, 1),
            (-2, -1), (-1, -2), (1, -2), (2, -1)
        ]
        
        # Initialize chessboard with -1 (unvisited)
        board = [[-1 for _ in range(n)] for _ in range(n)]
        board[0][0] = 0  # Start from (0, 0)
        
        # Helper function for backtracking
        def is_valid(x, y):
            return 0 <= x < n and 0 <= y < n and board[x][y] == -1
        
        def solve(x, y, move):
            if move == n * n:
                return True  # All squares visited
            
            for dx, dy in directions:
                nx, ny = x + dx, y + dy
                if is_valid(nx, ny):
                    board[nx][ny] = move
                    if solve(nx, ny, move + 1):
                        return True
                    board[nx][ny] = -1  # Backtrack
            
            return False
        
        # Start solving from (0, 0)
        if solve(0, 0, 1):
            return board
        else:
            return []  # No solution exists
        
        