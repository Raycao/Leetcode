package IntersectionofTwoLinkedLists_160;

//source: https://leetcode.com/problems/intersection-of-two-linked-lists/#/solutions
//Discussion from Leetcode

//����k���κ�list�������t�Z
//�U�ۥͦ��@�ӽƻs��ListNode�A�]�����ListNode�����׮t�Z
//�ҥH���ƻs��ListNode�h���X�A���X�Ĥ@���|�����X���t�Z
//���b�Ĥ@�����X������A���s���ƻsListNode���V�����ListNode
//�z�L�o�ؤ覡�b�ĤG�����X�A��n�|�����Ĥ@�������X�t�Z�A�]�i�H�o��intersection list
public class ans2 {
	 //Definition for singly-linked list.
	public class ListNode {
	       int val;
	       ListNode next;
	       ListNode(int x) {
	           val = x;
	           next = null;
	       }
	}
	
	public class Solution {
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

	    if(headA == null || headB == null) return null;
	    
	    //���ͨ�ӽƻs��ListNode�A���ƻs��h���X
	    ListNode a = headA;
	    ListNode b = headB;
	    
	    
	    while( a != b){
	        //�ƻs�騫�X�i��|�J����׮t�Z�A�]�����s�ɦV�����ListNode
	    	//�b�ĤG�����X�K�|�����t�Z�A���@�PListNode
	    	a = a == null? headB : a.next;
	        b = b == null? headA : b.next;    
	    }
	    
	    return a;
	}
	}
}
