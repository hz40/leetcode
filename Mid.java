/**
 * 功能描述: 中间点
 *
 * @author hezhan
 * @date 2023/12/19 09:29
 */
public class Mid {
    public static void main(String[] args) {

    }

    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode low = head;
        while (fast == null && fast.next == null) {
            low = head.next;
            fast = fast.next.next;
        }
        return low;
    }
}
