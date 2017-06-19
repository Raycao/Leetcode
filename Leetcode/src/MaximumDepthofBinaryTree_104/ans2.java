package MaximumDepthofBinaryTree_104;


//From Leetcode Discussion
//跟ans.java其實意思一樣，但較為精省俐落
public class ans2 {
	public class TreeNode {
	       int val;
	       TreeNode left;
	       TreeNode right;
	       TreeNode(int x) { val = x; }
	}
	
	public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
        }
    }
}
