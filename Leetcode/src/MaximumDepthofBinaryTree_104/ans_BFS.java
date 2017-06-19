package MaximumDepthofBinaryTree_104;

import java.util.*;

//From Leetcode Discussion
//¨Ï¥ÎBFS¨«³X
public class ans_BFS {
	public class TreeNode {
	       int val;
	       TreeNode left;
	       TreeNode right;
	       TreeNode(int x) { val = x; }
	}
	
	public int maxDepth(TreeNode root) {
	    if(root == null) {
	        return 0;
	    }
	    Queue<TreeNode> queue = new LinkedList<>();
	    queue.offer(root);
	    int count = 0;
	    while(!queue.isEmpty()) {
	        int size = queue.size();
	        while(size-- > 0) {
	            TreeNode node = queue.poll();
	            if(node.left != null) {
	                queue.offer(node.left);
	            }
	            if(node.right != null) {
	                queue.offer(node.right);
	            }
	        }
	        count++;
	    }
	    return count;
	}
}
