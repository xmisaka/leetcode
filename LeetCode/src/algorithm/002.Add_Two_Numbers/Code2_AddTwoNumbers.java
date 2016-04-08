package algorithm;

/** 
 * @ClassName: Code2_AddTwoNumbers 
 * @Description: https://leetcode.com/problems/add-two-numbers/
 * @author Warming 
 * @date 2016-4-7 下午5:25:20 
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
				//System.out.println(l1.val +"，"+ l2.val);
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
	
	
	//问题关键在于何时给临时节点申请next节点。三种情况：l1.next不空，l2.next不空，有进位
	public static ListNode addTwoNumbers2(ListNode l1, ListNode l2){
		ListNode res = new ListNode(0);
		ListNode cur = res;
		int sum = 0;
		while(true){
			if(l1 != null){
				sum += l1.val;
				l1 = l1.next;
			}
			if(l2 != null){
				sum += l2.val;
				l2 = l2.next;
			}
			
			cur.val = sum & 10;
			sum /= 10;
			
			if(l1.next != null || l2.next != null || sum == 1){
				cur = (cur.next = new ListNode(0));
			}else{
				break;
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
