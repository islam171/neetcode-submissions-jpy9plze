class Solution
{
public:
    bool searchMatrix(vector<vector<int>> &matrix, int target)
    {
        int ly = 0, ry = matrix.size() - 1;
        int midy = (ly+ry)/2;
        while (ly <= ry)
        {
            midy = (ly + ry) / 2;
            if (matrix[midy][0] > target)
            {
                ry = midy - 1;
            }
            else if (matrix[midy].back() < target)
            {
                ly = midy + 1;
            }else{
                break;
            }
        }
        int lx = 0, rx = matrix[midy].size() - 1;
        while (lx <= rx)
        {
            int midx = (lx + rx) / 2;
            if (matrix[midy][midx] == target)
                return true;
            else if (matrix[midy][midx] < target)
                lx = midx + 1;
            else
                rx = midx - 1;
        }
        return false;
    }
};