package LowestCommonAncestorOfaBinarySearchTree_235;

import LowestCommonAncestorOfaBinarySearchTree_235.ans.TreeNode;

//source: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/#/solutions
//�Ӧۺ��͸��D
//ans: �ĥλ��j , �b�����O�h�ĥ�while

//Iterative, O(1) space ���N�k
public class ans2 {
	//Definition for a binary tree node.
	   public class TreeNode {
	       int val;
	       TreeNode left;
	       TreeNode right;
	       TreeNode(int x) { val = x; }
	   }
	
	//�Q��while�ӸѨM���D
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	    while ((root.val - p.val) * (root.val - q.val) > 0) //���]�O����ƭȡA�p�G�@�j�@�p�~�|����j��
	        root = p.val < root.val ? root.left : root.right; 
	    return root;
	}
}
