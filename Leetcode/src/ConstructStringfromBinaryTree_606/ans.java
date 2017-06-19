package ConstructStringfromBinaryTree_606;

//source: https://leetcode.com/problems/construct-string-from-binary-tree/#/description

//�D�n�O�Φa�^�������P�޿�
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
	            ans = ""; //�ݧP�_�A�i��s��ڤ]�S�� 
	        }else{
	            ans = Integer.toString(t.val);
	            
	            //�̷Ӥ��P���p�i��B�z
	            if(t.left != null && t.right != null){
	            	//�p�G���k�����ȡA���}�B�z
	                ans = ans+"(";
	                left = tree2str(t.left);
	                ans = ans+ left +")";
	                
	                ans = ans+"(";
	                right = tree2str(t.right);  
	                ans = ans+ right +")";
	                
	            }else if(t.left != null && t.right == null){
	            	//�p�G�����l��A�S���k�l��
	            	//�K�����k�l��A�u�񥪤l��
	                ans = ans+"(";
	                left = tree2str(t.left);
	                ans = ans + left + ")";
	                
	            }else if(t.left == null && t.right != null){
	            	//�p�G�S�����l��A���k�l��
	            	//�ݦb���l���A���A�������šA�øɤW�k�l�𤺮e
	                ans = ans+"()(";
	                right = tree2str(t.right);
	                ans = ans + right + ")";
	                
	            }else{} //�p�G�S���l��A���N����]����
	        }
	        
	        return ans;
	    }
	}
}
