class Solution {


int dfs(vector<vector<int>> &grid, int r, int c, int d)
    {
        if(r < 0 || c < 0 || r >= grid.size() || c >= grid[0].size() || grid[r][c] == 0) return d;
        grid[r][c] = 0;
        d++;

        d = max(d, dfs(grid, r, c+1, d));
        d = max(d, dfs(grid, r, c-1, d));
        d = max(d, dfs(grid, r+1, c, d));
        d = max(d, dfs(grid, r-1, c, d));
        return d;
    }

public:
    int maxAreaOfIsland(vector<vector<int>>& grid) {
        
        int n = grid.size();
        int m = grid[0].size();
        int c = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (grid[i][j] == 1)
                {
                    c = max(dfs(grid, i, j, 0), c);
                }
            }
        }
        return c;

    }
};
