/**
 * 功能描述: 删除链表元素
 *
 * @author hezhan
 * @date 2023/12/20 13:30
 */
public class RemoveListNode {
    public static void main(String[] args) {

    }
    public static ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return  null;
        }
        ListNode temp = new ListNode(-1,head);
        ListNode index = temp;

        while (index.next!=null){
            if(index.next.val==val){
                index.next=index.next.next;
            }else {
                index = index.next;
            }
        }
        return  temp.next;
    }
}
