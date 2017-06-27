package LowestCommonAncestorOfaBinarySearchTree_235;

//source: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/#/description
//BST�ѦҸ��: https://zh.wikipedia.org/wiki/�G���j�M��
//�y�L����SOLUTION�ҵo�A�֤߭��IBST��ڪ��ƭȷ|�����l��ƭȤ���

public class ans {
	   //Definition for a binary tree node.
	   public class TreeNode {
	       int val;
	       TreeNode left;
	       TreeNode right;
	       TreeNode(int x) { val = x; }
	   }
	  
	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        //�]���D�ئ������`�I�]��O�l��A�ҥH�p�Groot�w�g��l���|�N�^��
	    	if(root.val == p.val || root.val == q.val)
	            return root;
	        
	    	//�p�G���`�I�ƭȤp��l��A������������`�I�����k��]�A�|�������ݨD
	        if(p.val > root.val && q.val > root.val){
	           root = lowestCommonAncestor( root.right, p, q);
	           
	         //�p�G���`�I�ƭȤj��l��A������������`�I��������]�A�|�������ݨD
	        }else if(p.val < root.val && q.val < root.val){
	           root = lowestCommonAncestor( root.left, p, q);
	           
	         //�p�G�l��ƭȹ����`�I�ƭȭ�n���O�@�j�@�p�A��ܤl��b���`�I�@���@�k�A���ɤ��`�I���ӴN�O�|�p�����`�I
	        }else{
	            return root;
	        }
	        
	        return root;
	    }

}
