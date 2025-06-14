class Solution {
    public int islandPerimeter(int[][] grid) {  // TC - O(n*m) SC = O(1)

        int rows = grid.length;
        int cols = grid[0].length;
        int perimeter = 0;
       for(int i = 0; i<rows; i++)
       {
            for(int j = 0; j<cols; j++)
            {
                if(grid[i][j] == 1)
                {
                    perimeter += 4;

                    if(i > 0 && grid[i-1][j] == 1)
                    {
                        perimeter = perimeter - 2;
                    }

                    if(j > 0 && grid[i][j-1] == 1)
                    {
                        perimeter -= 2;

                    }
                }
            }
       } 

       return perimeter;
    }
}