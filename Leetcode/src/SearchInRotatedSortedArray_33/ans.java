package SearchInRotatedSortedArray_33;

//source: https://leetcode.com/problems/search-in-rotated-sorted-array/#/description

public class ans {
	public class Solution {
	    public int search(int[] nums, int target) {
	        int ans = -1;
	        for(int i = 0 ; i < nums.length ; i++){ //在陣列中找到目標值，找到救回傳其所引，反之就傳-1
	            if(nums[i] == target)
	               ans = i; 
	        }
	        
	        return ans;
	    }
	}
}
