package IntersectionofTwoLinkedLists_160;

//source: https://leetcode.com/problems/intersection-of-two-linked-lists/#/solutions
//Discussion from Leetcode

//此方法不用算list之間的差距
//各自生成一個複製的ListNode，因為原生ListNode的長度差距
//所以讓複製的ListNode去走訪，走訪第一次會有走訪的差距
//但在第一次走訪結束後，重新給複製ListNode指向給原生ListNode
//透過這種方式在第二次走訪，剛好會彌平第一次的走訪差距，也可以得到intersection list
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
	    
	    //產生兩個複製的ListNode，讓複製體去走訪
	    ListNode a = headA;
	    ListNode b = headB;
	    
	    
	    while( a != b){
	        //複製體走訪可能會遇到長度差距，因此重新導向給原生ListNode
	    	//在第二次走訪便會彌平差距，找到共同ListNode
	    	a = a == null? headB : a.next;
	        b = b == null? headA : b.next;    
	    }
	    
	    return a;
	}
	}
}
