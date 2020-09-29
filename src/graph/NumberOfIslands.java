package graph;

//LC-200
/*
 * Time complexity : O(M�N)
 * Space complexity : O(min(M,N)) because in worst case where the grid is filled with lands, 
 * the size of queue can grow up to min(M,N).
 * */
public class NumberOfIslands {
//	 public int numIslands(char[][] grid) {
//	        int islandCount = 0;
//	        for(int r =0; r < grid.length; r++){
//	            for(int c = 0; c < grid[0].length; c++){
//	                if(grid[r][c] == '1'){
//	                    islandCount++;
//	                    dfs(r, c, grid);
//	                }
//	            }
//	        }
//	        return islandCount;
//	    }
//
//	    public void dfs(int r, int c, char[][] grid){
//	        int noOfRows = grid.length;
//	        int noOfCols = grid[0].length;
//	        if(r < 0 || r >= noOfRows || c < 0 || c >= noOfCols || grid[r][c] == '0'){
//	            return;
//	        }
//
//	        grid[r][c] = '0';
//	        dfs(r-1, c, grid); // above
//	        dfs(r+1, c, grid); // below
//	        dfs(r, c-1, grid); // left
//	        dfs(r, c+1, grid); // right
//	    }

	



}
