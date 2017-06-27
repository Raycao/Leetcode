package LowestCommonAncestorOfaBinarySearchTree_235;

import LowestCommonAncestorOfaBinarySearchTree_235.ans.TreeNode;

//source: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/#/solutions
//來自網友解題
//ans: 採用遞迴 , 在此類別則採用while

//Iterative, O(1) space 迭代法
public class ans2 {
	//Definition for a binary tree node.
	   public class TreeNode {
	       int val;
	       TreeNode left;
	       TreeNode right;
	       TreeNode(int x) { val = x; }
	   }
	
	//利用while來解決問題
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	    while ((root.val - p.val) * (root.val - q.val) > 0) //其實也是比較數值，如果一大一小才會跳脫迴圈
	        root = p.val < root.val ? root.left : root.right; 
	    return root;
	}
}
