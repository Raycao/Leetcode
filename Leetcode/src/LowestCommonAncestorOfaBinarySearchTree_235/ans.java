package LowestCommonAncestorOfaBinarySearchTree_235;

//source: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/#/description
//BST參考資料: https://zh.wikipedia.org/wiki/二元搜尋樹
//稍微受到SOLUTION啟發，核心重點BST樹根的數值會介於兩子樹數值中間

public class ans {
	   //Definition for a binary tree node.
	   public class TreeNode {
	       int val;
	       TreeNode left;
	       TreeNode right;
	       TreeNode(int x) { val = x; }
	   }
	  
	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        //因為題目有說父節點也算是子樹，所以如果root已經跟子樹重疊就回傳
	    	if(root.val == p.val || root.val == q.val)
	            return root;
	        
	    	//如果父節點數值小於子樹，表示應該讓父節點載往右邊跑，會比較接近需求
	        if(p.val > root.val && q.val > root.val){
	           root = lowestCommonAncestor( root.right, p, q);
	           
	         //如果父節點數值大於子樹，表示應該讓父節點載往左邊跑，會比較接近需求
	        }else if(p.val < root.val && q.val < root.val){
	           root = lowestCommonAncestor( root.left, p, q);
	           
	         //如果子樹數值對於父節點數值剛好分別一大一小，表示子樹在父節點一左一右，此時父節點應該就是會小祖先節點
	        }else{
	            return root;
	        }
	        
	        return root;
	    }

}
