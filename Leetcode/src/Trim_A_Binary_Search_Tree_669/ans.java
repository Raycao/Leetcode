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
	        
	        TreeNode t = new TreeNode(root.val); //���@�ӽƻs��tree�A�ΨӦ^��
	        
	        if(root.val<L){ //�p�G�ڤp����ɡA�N�q�ڪ��k�`�I�}�l��A�]���k�`�I�ƭ��u���j���
	           
	        	t = trimBST(root.right,L,R); //�u��ڪ��k�`�I
	           	           
	        }else if(root.val>R){ //�p�G�ڤj����ɡA�N�q�ڪ����`�I�}�l��A�]�����`�I�ƭ��u���p���
	           
	        	t = trimBST(root.left,L,R); //�u��ڪ����`�I
	           	           
	        }else if(root.val>L || root.val<R){ //�p�G�ڪ��ƭȤ�����ɤ��A�h�����~�򩹤U��
	            t.right = trimBST(root.right,L,R);
	            t.left = trimBST(root.left,L,R);
	        }
	        return t;
	    }	
}
