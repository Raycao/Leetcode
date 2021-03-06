package MaxConsecutiveOnes_485;

import java.util.Arrays;

public class exp {
	public static void main(String[] args){
		exp fun = new exp();
		int[] nums = {1,0,1,1,0,1};

		System.out.println(fun.findMaxConsecutiveOnes(nums));
	}
	
	public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int temp = 0;
        boolean sign = true;
        
        //利用for迴圈走訪
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1 && sign){ 
            	//如果sign是true，表示還在連續出現1的狀況，temp加1
                temp++;
            }else{
            	//否則就temp重算
                temp = 0;
            }
            
            //當temp的值大於max，表示有更大的連續數目出現
            if(temp>max)
                max = temp;
        }
        
        return max;
    }
}
