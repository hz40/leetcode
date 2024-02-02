import java.util.WeakHashMap;

/**
 * 功能描述: 环形链表2
 *
 * @author hezhan
 * @date 2023/12/20 14:06
 */
public class AnnularListNode {

    public static void main(String[] args) {

    }

    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        //快慢指针
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ListNode a = fast;
                ListNode b = head;
                while (a != b) {
                    a = a.next;
                    b = b.next;
                }
                return a;
            }
        }
        return null;
    }
}
