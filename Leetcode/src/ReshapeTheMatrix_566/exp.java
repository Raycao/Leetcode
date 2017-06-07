package ReshapeTheMatrix_566;

import java.util.ArrayList;

public class exp {
	public static void main(String[] args){
		exp fun = new exp();
		int[][] test = {{2,5},{11,3}};
		int r = 1 , c = 4;
		int ans[][]; 
		
		ans = fun.matrixReshape(test, r, c);
		
		for(int i =0; i<ans.length ; i++){
			for(int j=0 ; j<ans[i].length ; j++){
				System.out.printf("%d ",ans[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public int[][] matrixReshape(int[][] nums, int r, int c) {
        int count = 0; //用來算nums的元素數量
        int count2 = 0; //純粹用來將arraylist內的元素放進答案內
		int[][] ans = new int[r][c]; //將題目會給的陣列先new出來，反正之後要當放答案的地方交出去
		ArrayList<Integer> myList = new ArrayList<Integer>(); 
		//因為不確定nums陣列的大小，如果要先做個暫時的陣列放nums內的元素，還要先等for迴圈跑完迴圈
		//才有辦法new一個等大的站存陣列來放元素，因此這邊選用ArrayList再編走訪nums的時候，就可以順便把元素值放進去
		
		//首先走訪nums陣列，因為有可能不是矩陣陣列，所以才選用這種方式走訪
		//不然應該可以直接列跟高的數量相乘，來找數量
		for(int i=0 ; i<nums.length ; i++){
			for(int j=0 ; j<nums[i].length ; j++){
				count++; //每找到一個就count+1
				myList.add(nums[i][j]); //順便把元素放進myList中，用arraylist就是方便，你可以不必先宣告陣列大小
			}
		}
		
		//依照題目給的列高相乘，看看是否裝得下，如果裝不下，就回傳原本的陣列nums
		if(r*c > count){
			return nums;
		}else{ //如果裝得下，就把元素從myList依依取出，並放進ans陣列中
			for(int i=0 ; i<ans.length ; i++){
				for(int j=0 ; j<ans[i].length ; j++){
					ans[i][j] = myList.get(count2);
					count2++; //count2純粹用來一一走訪myList的各元素
				}
			}
		    return ans; //回傳ans陣列
		}
    }
	
}
