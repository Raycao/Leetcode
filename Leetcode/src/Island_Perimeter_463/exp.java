package Island_Perimeter_463;
//¹ê§@
public class exp {
	public static void main(String[] args) {
		exp fun = new exp();
		int[][] test = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		
		System.out.print(fun.islandPerimeter(test));		
	}
	
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
