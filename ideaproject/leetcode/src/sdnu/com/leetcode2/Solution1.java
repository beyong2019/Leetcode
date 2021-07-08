package sdnu.com.leetcode2;
/**
 * leetcode2 solution1
 *
 * @author Beyong
 * @date 2021/05/14 21:03
 **/

public class Solution1 {
    public static void main(String[] args){
        ListNode l1 = new ListNode(2, null);
        l1.next = new ListNode(4, null);
        l1.next.next = new ListNode(3, null);
        ListNode l2 = new ListNode(5, null);
        l2.next = new ListNode(6, null);
        l2.next.next = new ListNode(4, null);
        ListNode list = addTwoNumbers(l1, l2);
        while(list != null){
            System.out.print(list.val);
            list = list.next;
        }
    }
/**
 *
 * @author Beyong
 * @date 2021/05/14 23:57
 * @param l1
 * @param l2
 * @return sdnu.com.leetcode2.ListNode
 */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) {return null;}
        int carry = 0;
        ListNode head = new ListNode();
        ListNode temp = head;
        while(l1!=null || l2!=null || carry!=0){
            int var1 = l1==null ? 0 : l1.val;
            int var2 = l2==null ? 0 : l2.val;
            int sum = var1 + var2 + carry;
            temp.next = new ListNode(sum % 10, null);
            temp = temp.next;
            carry = sum / 10;
            if(l1 != null) {l1 = l1.next;}
            if(l2 != null) {l2 = l2.next;}
        }
        return head.next;
    }
}


