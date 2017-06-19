package MaximumDepthofBinaryTree_104;

//source: https://leetcode.com/problems/maximum-depth-of-binary-tree/#/description

//�Q�Υ��k�l�����j�p�A�^�Ǹ��j�����ӡA�̫�N�|�o��̤j��
public class ans {
	//Definition for a binary tree node.
	public class TreeNode {
		       int val;
		       TreeNode left;
		       TreeNode right;
		       TreeNode(int x) { val = x; }
		}
	
	public int maxDepth(TreeNode root) {
		//�p�G�S���ڡA��ܳs�@�ʾ𳣨S���A�ҥH�@�h�]�S���G�^��0
        if(root==null) return 0;

        int max; //�ΨӦs��ثe�̤j��
        //���k�w�]��0�h�A�ҥH�p�G��null�N���h�ק�A�O��0
        int left = 0; 
        int right = 0;
        
        //�p�G���k�����Onull�A��ܳ����l��A�b�U�ۤU�h���h�Ʋέp
        if(root.left!=null && root.right!=null){
            left = maxDepth(root.left);
            right = maxDepth(root.right);
        }else if(root.left!=null){
        	//�p�G���l�𤣬�null�A�N�����l��h�Ʋέp
            left = maxDepth(root.left);
        }else if(root.right!=null){
        	//�p�G�k�l�𤣬�null�A�N���k�l��h�Ʋέp
            right = maxDepth(root.right);
        }else{} //���S���ܳ������A�ϥ��w�]���k��0
        
        //�]���ثe�Ҧb���h���٨S��i�h�A�ҥH�̫��٭n�[�W1
        return 1+Math.max(left,right);
    }
}
