package MergeTwoBinaryTrees_617;

//source: https://leetcode.com/problems/merge-two-binary-trees/#/description


//Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}

public class ans {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        
        if((t1==null)&&(t2==null)) return null;

        TreeNode t = new TreeNode((t1==null?0:t1.val)+(t2==null?0:t2.val));
        
        t.left = mergeTrees( t1==null?null:t1.left , t2==null?null:t2.left );
        t.right = mergeTrees(t1==null?null:t1.right , t2==null?null:t2.right );
        
        return t;
    }
}