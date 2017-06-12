package ArrayPartitionI_561;

import java.util.Arrays;

public class exp {
	public static void main(String[] args){
		int ans;
		int[] nums = {1,4,3,2};
		
		exp fun = new exp();
		ans = fun.arrayPairSum(nums);
	
		System.out.println(ans);
	}
	
	public int arrayPairSum(int[] nums) {
        Arrays.sort(nums); //先進行排序，此方法為升冪排序，所以數字由小至大
        int sum = 0;
        
        //採升冪排序後的陣列，我們只要取奇數index的元素相家就可以得到最大
        //因為要取min最大，我們絕對不可能取到最大的元素，所以我們將最大與第二大放一起
        //至少可以得到第二大值，因此排序後兩兩一組，每一組都可以取到第二大，可以取到min相加最大值
        for(int i=0; i<nums.length/2; i++){
            sum += nums[i*2];
        }
        
        return sum;
    }
}
