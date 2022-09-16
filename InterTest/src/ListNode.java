
public class ListNode {

	private ListNode next;

	public ListNode middleNode1(ListNode head) {
		 
		   int len =0;
		 
		   ListNode temp = head;
		 
		   //Find length of a linked list
		   while (temp !=null){
		       temp = temp.next;
		       len++;
		   }
		 
		   //Intialized, again with head pointer
		   temp = head;
		   int mid = 0;
		 
		   while (mid < len/2){
		 
		      temp = temp.next;
		      mid++;
		   }
		 
		   return temp;}
}
