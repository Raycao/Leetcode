package Average_of_Levels_in_Binary_Tree_637;

//https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
//���D�ѷӺ��ͧ@�k�~���X��
//�]�Ƿ|�Fqueue���Ϊk�Aqueue�O���i���X������
//queue��offer�Ppoll��O����F���̫᭱�P���X�̫e���F�誺�欰
//BFS�@�k
import java.util.*;

public class ans {

	 // Definition for a binary tree node. 
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }

	  public List<Double> averageOfLevels(TreeNode root) {
	        List<Double> ans = new ArrayList<>();
	        Queue<TreeNode> queue = new LinkedList<>(); //�إ��x�sTreenode���A��queue
	        
	        if(root == null) return null;
	        
	        queue.offer(root); //��iroot�A�]�N�O�ڪ���
	        //�t�~�]�z�L��iTreeNode���A�A�]����i�h���F��|���쥻TreeNode���쵲
	        
	        while(!queue.isEmpty()){ //�P�O�̭��O�_���F��
	            int count = queue.size();
	            double sum = 0;
	            for(int i=0; i<count; i++){
	                TreeNode t = queue.poll(); //������queue��TreeNode���A���ȥs�X��                
	                sum += t.val;
	                
	                //��観����]��queue����iTreeNode���A������A�ӥB�O�qroot��_
	                //�]�����M�O�b�o�Ӱ϶��~�ͦ���t(TreeNode����)�A�]�i�H�֦��쥻root���쵲
	                if(t.left != null) queue.offer(t.left); 
	                if(t.right != null) queue.offer(t.right);                    
	            }
	            ans.add(sum/count);
	        }       
	        
	        return ans;
	    }
}
