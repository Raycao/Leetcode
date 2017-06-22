package IntersectionofTwoLinkedLists_160;

//source: https://leetcode.com/problems/intersection-of-two-linked-lists/#/solutions
//Discussion from Leetcode

import IntersectionofTwoLinkedLists_160.ans2.ListNode;

//�]���|��ListNode�����׮t�Z�A����k����X�t�Z�A�������t�Z
//�A�h����O�_�Ointersection
public class ans3 {
	public class ListNode {
	       int val;
	       ListNode next;
	       ListNode(int x) {
	           val = x;
	           next = null;
	       }
	}
	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	    int lenA = length(headA), lenB = length(headB);
	    // move headA and headB to the same start point
	    while (lenA > lenB) {
	        headA = headA.next;
	        lenA--;
	    }
	    while (lenA < lenB) {
	        headB = headB.next;
	        lenB--;
	    }
	    // find the intersection until end
	    while (headA != headB) {
	        headA = headA.next;
	        headB = headB.next;
	    }
	    return headA;
	}

	private int length(ListNode node) {
	    int length = 0;
	    while (node != null) {
	        node = node.next;
	        length++;
	    }
	    return length;
	}
}
