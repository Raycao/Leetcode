package SearchInRotatedSortedArray_33;

public class exp {
	public static void main(String[] args){
		exp fun = new exp();
		
		int[] nums = {1,3,5,9};
		int target = 4, target2 = 5 ;
		int ans ,ans2;
		
		ans = fun.search(nums , target);
		ans2 = fun.search(nums , target2);
		
		System.out.println(ans);
		System.out.println(ans2);
	}
	

	    public int search(int[] nums, int target) {
	        int ans = -1;
	        for(int i = 0 ; i < nums.length ; i++){ //�b�}�C�����ؼЭȡA���Ϧ^�Ǩ�ҤޡA�Ϥ��N��-1
	            if(nums[i] == target)
	               ans = i; 
	        }
	        
	        return ans;
	    }
	
}
