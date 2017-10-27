package Average_of_Levels_in_Binary_Tree_637;

//https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
//此題參照網友作法才做出來
//也學會了queue的用法，queue是先進先出的概念
//queue的offer與poll方別為放東西到最後面與取出最前面東西的行為
//BFS作法
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
	        Queue<TreeNode> queue = new LinkedList<>(); //建立儲存Treenode型態的queue
	        
	        if(root == null) return null;
	        
	        queue.offer(root); //放進root，也就是根的值
	        //另外也透過放進TreeNode型態，因此放進去的東西會有原本TreeNode的鏈結
	        
	        while(!queue.isEmpty()){ //判別裡面是否有東西
	            int count = queue.size();
	            double sum = 0;
	            for(int i=0; i<count; i++){
	                TreeNode t = queue.poll(); //直接把queue內TreeNode型態的值叫出來                
	                sum += t.val;
	                
	                //剛剛有提到因為queue內放進TreeNode型態的物件，而且是從root放起
	                //因此雖然是在這個區塊才生成的t(TreeNode物件)，也可以擁有原本root的鏈結
	                if(t.left != null) queue.offer(t.left); 
	                if(t.right != null) queue.offer(t.right);                    
	            }
	            ans.add(sum/count);
	        }       
	        
	        return ans;
	    }
}
