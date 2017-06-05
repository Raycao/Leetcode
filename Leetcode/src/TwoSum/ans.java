package TwoSum;

//source: https://leetcode.com/problems/two-sum/#/description

public class ans {
	public int[] twoSum(int[] nums, int target) {
        int[] a = {0,0};
        
        //利用兩個for迴圈，利用組合的方式兩兩找值合併來求出答案
        for(int i=0;i<=nums.length-1;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                if((nums[i]+nums[j]) == target){
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        
        return a;
    }
}
