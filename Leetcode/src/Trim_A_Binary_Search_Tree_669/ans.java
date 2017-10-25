package Trim_A_Binary_Search_Tree_669;

//https://leetcode.com/problems/trim-a-binary-search-tree/description/
public class ans {
	
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	}
	

	public TreeNode trimBST(TreeNode root, int L, int R) {
	        if(root == null)
	            return null;
	        
	        TreeNode t = new TreeNode(root.val); //做一個複製的tree，用來回傳
	        
	        if(root.val<L){ //如果根小於邊界，就從根的右節點開始找，因為右節點數值臂都大於根
	           
	        	t = trimBST(root.right,L,R); //只找根的右節點
	           	           
	        }else if(root.val>R){ //如果根大於邊界，就從根的佐節點開始找，因為佐節點數值臂都小於根
	           
	        	t = trimBST(root.left,L,R); //只找根的左節點
	           	           
	        }else if(root.val>L || root.val<R){ //如果根的數值介於邊界中，則兩邊繼續往下找
	            t.right = trimBST(root.right,L,R);
	            t.left = trimBST(root.left,L,R);
	        }
	        return t;
	    }	
}
