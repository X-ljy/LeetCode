package DataStructure;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

public class leetcode21 {

    /**
     * class ListNode{
     *     int val;
     *     ListNode next;
     *     ListNode(int x){
     *         val = x;
     *     }
     * }
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){

        //设置一个新的链表（合并后的）的头结点
        ListNode temp = new ListNode(-1);
        //result代表返回的头结点
        ListNode result = temp;
        //如果l1 l2 都不为null，则进行比较
        //如果l1 小于 l2  则将temp的 next 指向 此时l1的节点，然后l1在后移一位，同时更新temp的值。
        //l2 同理
        while (l1 != null && l2 != null){
            if(l1.val < l2.val){
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            }else {
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }
        }

        //如果l1  l2 有一方变成了null 则 将此时的temp的next指向另一方的剩下的节点（即将剩余的节点接在temp后面）
        if(l1 == null){
            temp.next = l2;
        }
        if(l2 == null){
            temp.next = l1;
        }
        //返回头结点
        return result.next;
    }

}

