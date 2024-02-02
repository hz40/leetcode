/**
 * 功能描述: 合并链表
 *
 * @author hezhan
 * @date 2023/12/19 09:44
 */
public class SumListNode {
    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listNodeNew = new ListNode(-1);
        ListNode head = listNodeNew;
        ListNode up = list1;
        ListNode down = list2;
        while (up!=null&&down!=null){
            if(up.val<=down.val){
                head.next= up;
                up = up.next;
                head = head.next;
            }else {
                head.next= down;
                down = down.next;
                head = head.next;
            }
        }
        if(down==null){
            head.next=up;
        }
        if(up==null){
            head.next=down;
        }
        return  listNodeNew.next;
    }
}
