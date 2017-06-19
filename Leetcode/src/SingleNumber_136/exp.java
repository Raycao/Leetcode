package SingleNumber_136;

import java.util.Arrays;

public class exp {
	public static void main(String[] args){
		exp fun = new exp();
		int[] nums = {1,1,2,2,3,3,4};
		
		System.out.printf("The single number is %d", fun.singleNumber(nums));
	}
	
	public int singleNumber(int[] nums) {
        //先用sort方法就陣列重新排列，由於只會有一個數值不重複出現兩次
		//透過排序，可以兩兩排一起，只要兩兩查找就可以明顯找出單一值
		Arrays.sort(nums);
        int single=-1;
        
        //如果陣列只有一個值，想必就是答案
       if(nums.length == 1)
            single = nums[0];
       
        //利用for迴圈走訪，從第二個值開始，每次加2
        for(int i=1; i<nums.length; i += 2){
        	//如果前一個值，跟現在不同，那表示出現單一值，排在前面的值就是答案
        	//如果i從0開始，肯定要寫成i跟i+1進行比較，這樣就有可能超過陣列長度
            if(nums[i] != nums[i-1]){
                single = nums[i-1];
                break; //找到即跳出迴圈，因為出現不重複的情形，後面肯定就不重複
            }else if(i+2 >= nums.length){
            	//用來處理但依值在最後面的情況，因為但依值在最後面i+1就是終點
            	//所以i+2超過總長度，表示單一值是最後一個
                single = nums[i+1];
                break;
            }
        }
        return single;
    }
}
