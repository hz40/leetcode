/**
 * 功能描述: 反转链表
 *
 * @author hezhan
 * @date 2023/12/19 10:15
 */
public class RollbackListNode {
    public static void main(String[] args) {

    }
    public static ListNode reverseList(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode reverse = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reverse;
    }
}
