package MaximumDepthofBinaryTree_104;

//source: https://leetcode.com/problems/maximum-depth-of-binary-tree/#/description

//利用左右子樹比較大小，回傳較大的那個，最後就會得到最大值
public class ans {
	//Definition for a binary tree node.
	public class TreeNode {
		       int val;
		       TreeNode left;
		       TreeNode right;
		       TreeNode(int x) { val = x; }
		}
	
	public int maxDepth(TreeNode root) {
		//如果沒有根，表示連一棵樹都沒有，所以一層也沒有故回傳0
        if(root==null) return 0;

        int max; //用來存放目前最大值
        //左右預設為0層，所以如果為null就不去修改，保持0
        int left = 0; 
        int right = 0;
        
        //如果左右都不是null，表示都有子樹，在各自下去做層數統計
        if(root.left!=null && root.right!=null){
            left = maxDepth(root.left);
            right = maxDepth(root.right);
        }else if(root.left!=null){
        	//如果左子樹不為null，就做左子樹層數統計
            left = maxDepth(root.left);
        }else if(root.right!=null){
        	//如果右子樹不為null，就做右子樹層數統計
            right = maxDepth(root.right);
        }else{} //都沒有變都不做，反正預設左右為0
        
        //因為目前所在的層數還沒算進去，所以最後還要加上1
        return 1+Math.max(left,right);
    }
}
