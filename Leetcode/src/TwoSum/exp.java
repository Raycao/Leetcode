package TwoSum;

public class exp {
	public static void main(String[] args){
		exp fun = new exp();
		int[] nums = {2,3,4};
		fun.twoSum(nums, 6);
	}
	
	public void twoSum(int[] nums, int target) {
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
        
        System.out.printf("%d , %d",a[0],a[1]); //將哪兩個元素組成答案的索引位置印出來
    }
}
