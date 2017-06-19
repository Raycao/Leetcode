package ConstructStringfromBinaryTree_606;

import ConstructStringfromBinaryTree_606.ans2.TreeNode;

//From Leetcode Discussion
//執行肅隊最快的解答
//多寫另一個方法來呼叫
public class ans3 {
	//Definition for a binary tree node.
	   public class TreeNode {
	       int val;
	       TreeNode left;
	       TreeNode right;
	       TreeNode(int x) { val = x; }
	   }	
	public String tree2str(TreeNode t) {
		//使用StringBuilder來做append，會比用"+"要來的有效率
        StringBuilder sb = new StringBuilder();
        helper (sb, t);
        return sb.toString();
    }
    public void helper(StringBuilder sb,TreeNode t){
        if(t!=null){
            sb.append(t.val);
            if(t.left!=null||t.right!=null){
            	//不管如何左子樹一定會處理，差別只在於是否有內容
                sb.append("(");
                helper(sb,t.left);
                sb.append(")");
                
                //右子樹就不一定會處理，只有在有存在內容才會需要處理
                if(t.right!=null){
                    sb.append("(");
	                helper(sb,t.right);
	                sb.append(")");
                }
            }
        }
        
    }
}
