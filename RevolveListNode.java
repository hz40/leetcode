/**
 * 功能描述: 选择链表
 *
 * @author hezhan
 * @date 2023/12/20 09:31
 */
public class RevolveListNode {
    public static void main(String[] args) {

    }

    public static ListNode rotateRight(ListNode head, int k) {
        //1.先知道链表的长度
        //2.长度除于旋转值就是余数就是倒数第N个对象为新的链表的表头
        //3.然后断开新链表头，原来表头安装原来表尾部

        // 边界条件判断
        if( head == null)  {
            return head;
        }
        //获取长度
        ListNode cur = head;
        int i = 0;
        while (cur!=null){
            cur = cur.next;
            i++;
        }
        //取模
        k = k%i;

        ListNode fast = head;
        ListNode slow = head;
        //快指针先到K点
        for(int n =0;n<k;n++){
            fast=fast.next;
        }

        //快指针带慢指针一起动
        while (fast.next!=null){
            fast = fast.next;
            slow = slow .next;
        }

        //快指针指向了最后一个节点，需要将这个节点和原链表的头节点连接起来
        fast.next=head;

        ListNode newHead = slow.next;
        slow.next = null;
        return newHead;
    }
}
