package ConstructStringfromBinaryTree_606;

//source: https://leetcode.com/problems/construct-string-from-binary-tree/#/description

//主要是用地回的概念與邏輯
public class ans {
	//Definition for a binary tree node.
	   public class TreeNode {
	       int val;
	       TreeNode left;
	       TreeNode right;
	       TreeNode(int x) { val = x; }
	   }

	public class Solution {
	    public String tree2str(TreeNode t) {
	        String ans;
	        String left;
	        String right;
	        
	        if(t==null){
	            ans = ""; //需判斷，可能連樹根也沒有 
	        }else{
	            ans = Integer.toString(t.val);
	            
	            //依照不同情況進行處理
	            if(t.left != null && t.right != null){
	            	//如果左右都有值，分開處理
	                ans = ans+"(";
	                left = tree2str(t.left);
	                ans = ans+ left +")";
	                
	                ans = ans+"(";
	                right = tree2str(t.right);  
	                ans = ans+ right +")";
	                
	            }else if(t.left != null && t.right == null){
	            	//如果有左子樹，沒有右子樹
	            	//便忽略右子樹，只放左子樹
	                ans = ans+"(";
	                left = tree2str(t.left);
	                ans = ans + left + ")";
	                
	            }else if(t.left == null && t.right != null){
	            	//如果沒有左子樹，有右子樹
	            	//需在左子樹放括弧，期內為空，並補上右子樹內容
	                ans = ans+"()(";
	                right = tree2str(t.right);
	                ans = ans + right + ")";
	                
	            }else{} //如果沒有子樹，那就什麼也不放
	        }
	        
	        return ans;
	    }
	}
}
