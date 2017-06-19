package ConstructStringfromBinaryTree_606;

import ConstructStringfromBinaryTree_606.ans2.TreeNode;

//From Leetcode Discussion
//����¶��̧֪��ѵ�
//�h�g�t�@�Ӥ�k�өI�s
public class ans3 {
	//Definition for a binary tree node.
	   public class TreeNode {
	       int val;
	       TreeNode left;
	       TreeNode right;
	       TreeNode(int x) { val = x; }
	   }	
	public String tree2str(TreeNode t) {
		//�ϥ�StringBuilder�Ӱ�append�A�|���"+"�n�Ӫ����Ĳv
        StringBuilder sb = new StringBuilder();
        helper (sb, t);
        return sb.toString();
    }
    public void helper(StringBuilder sb,TreeNode t){
        if(t!=null){
            sb.append(t.val);
            if(t.left!=null||t.right!=null){
            	//���ަp�󥪤l��@�w�|�B�z�A�t�O�u�b��O�_�����e
                sb.append("(");
                helper(sb,t.left);
                sb.append(")");
                
                //�k�l��N���@�w�|�B�z�A�u���b���s�b���e�~�|�ݭn�B�z
                if(t.right!=null){
                    sb.append("(");
	                helper(sb,t.right);
	                sb.append(")");
                }
            }
        }
        
    }
}
