package algorithm;

/** 
 * @ClassName: Code2_AddTwoNumbers 
 * @Description: https://leetcode.com/problems/add-two-numbers/
 * @author Warming 
 * @date 2016-4-7 ÏÂÎç5:25:20 
 *  
 */
public class Code2_AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode temp = res;
		int flag = 0;

		while(l1 != null && l2 != null){
			if(l1.next != null && l2.next != null){
				temp.val = (l1.val + l2.val + flag) % 10 ;
				flag = (l1.val + l2.val +flag) / 10;
				l1 = l1.next;
				l2 = l2.next;
				temp.next = new ListNode(0);
				temp = temp.next;
			}
			if(l1.next == null && l2.next == null){
				temp.val = (l1.val + l2.val + flag) % 10 ;
				//System.out.println(l1.val +"£¬"+ l2.val);
				flag = (l1.val + l2.val + flag) / 10;
				if(flag == 1){
					temp.next = new ListNode(1);
				}
				return res;
			}	
			if(l1.next != null && l2.next == null){
				temp.val = (l1.val + l2.val + flag) % 10 ;
				flag = (l1.val + l2.val +flag) / 10;
				while(l1.next != null){
					temp.next = new ListNode((l1.next.val + flag) % 10);
					flag = (l1.next.val + flag) / 10;
					l1 = l1.next;
					temp = temp.next;
				}
				if(flag == 1){
					temp.next = new ListNode(1);
				}
				return res;
			}
			if(l2.next != null && l1.next == null){
				temp.val = (l1.val + l2.val + flag) % 10 ;
				flag = (l1.val + l2.val +flag) / 10;
				while(l2.next != null){
					temp.next = new ListNode((l2.next.val + flag) % 10);
					flag = (l2.next.val + flag) / 10;
					l2 = l2.next;
					temp = temp.next;
				}
				if(flag == 1){
					temp.next = new ListNode(1);
				}
				return res;
			}
		}
		return res;
    }
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(9);
		l2.next = new ListNode(9);
		l2.next.next = new ListNode(9);
		ListNode res = addTwoNumbers(l1, l2);
		while(res != null){
			System.out.println(res.val);
			res = res.next;
		}
	}

}

class ListNode {
	 int val;
	 ListNode next;
	 ListNode(int x) { val = x; }
}
