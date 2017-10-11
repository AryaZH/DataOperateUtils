//package LeetCode;
//
//public class AddTwoNum_LinkedList {
//
//	public static void main(String[] args) {
//
//	}
//
//
//	public class ListNode {
//		int val;
//		ListNode next;
//
//		ListNode(int x) {
//			val = x;
//		}
//	}
//
//	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//		ListNode head = new ListNode(0);
//		int carry=0;
//		while(l1!=null||l2!=null)
//		{
//			int x=(l1!=null)?l1.val:0;
//			int y=(l2!=null)?l2.val:0;
//			int sum=carry+x+y;
//			carry=sum/10;
//			head.next=new ListNode(sum%10);
//			head=head.next;
//			if(l2!=null) l2=l2.next;
//			if(l1!=null) l1=l1.next;
//		}
//		if(carry>0){
//			head.next=new ListNode(carry);
//		}
//		return head.next;
//	}
//}