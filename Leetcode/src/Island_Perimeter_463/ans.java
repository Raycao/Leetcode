package Island_Perimeter_463;


//https://leetcode.com/problems/island-perimeter/description/
//�Q�k�O���@�ӧ�j�Ӱ}�C (�C��U+2)�A�A��쥻���x�}�ƭȩ�쥿�����A�h��1���j�����h��0�N���D���h����
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
