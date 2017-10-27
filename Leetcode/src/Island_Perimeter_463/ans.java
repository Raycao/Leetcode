package Island_Perimeter_463;


//https://leetcode.com/problems/island-perimeter/description/
//想法是放到一個更大個陣列 (列行各+2)，再把原本的矩陣數值放到正中央，去算1的隔壁有多少0就知道有多少邊
public class ans {
	    public int islandPerimeter(int[][] grid) {
	        int row = grid.length;
	        int col = grid[0].length;
	        int[][] newArray = new int[row+2][col+2];
	        int sum = 0;
	        
	        for(int i=0; i<row; i++){
	            for(int j=0; j<col; j++){
	                if(grid[i][j]==1)
	                    newArray[i+1][j+1] = 1;
	            }
	        }
	        
	        for(int i=0; i<row+1; i++){
	            for(int j=0; j<col+1; j++){
	                if(newArray[i][j]==1){
	                    if(newArray[i+1][j] == 0)
	                        sum++;
	                    if(newArray[i-1][j] == 0)
	                        sum++;
	                    if(newArray[i][j+1] == 0)
	                        sum++;
	                    if(newArray[i][j-1] == 0)
	                        sum++; 
	                }            
	            }
	        }
	        return sum; 
	    }
}
