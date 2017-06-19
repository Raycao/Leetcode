package MaximumDepthofBinaryTree_104;

import java.util.*;

//From Leetcode Discussion
//¨Ï¥ÎDFS¨«³X
public class ans_DFS {
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
	    
	    Stack<TreeNode> stack = new Stack<>();
	    Stack<Integer> value = new Stack<>();
	    stack.push(root);
	    value.push(1);
	    int max = 0;
	    while(!stack.isEmpty()) {
	        TreeNode node = stack.pop();
	        int temp = value.pop();
	        max = Math.max(temp, max);
	        if(node.left != null) {
	            stack.push(node.left);
	            value.push(temp+1);
	        }
	        if(node.right != null) {
	            stack.push(node.right);
	            value.push(temp+1);
	        }
	    }
	    return max;
	}
}
