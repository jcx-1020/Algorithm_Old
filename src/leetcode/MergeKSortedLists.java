package leetcode;


/**
 * 合并 k 个排序链表，返回合并后的排序链表。
 */
public class MergeKSortedLists {

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }

        ListNode newList = lists[0];
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] == null) {
                continue;
            } else {
                newList = lists[i];
                break;
            }
        }
        if (newList == null) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        for (int i = 1; i < lists.length; i++) {
            if (lists[i] == null) {
                continue;
            }
            ListNode head1 = newList;
            ListNode head2 = lists[i];
            if (newList.val > lists[i].val) {
                head2 = newList;
                head1 = lists[i];
            }
            while (head1.next != null && head2.next != null) {
                if (head1.val < head2.val) {
                    if (head1.next.val < head2.val){
                        head1 = head1.next;
                    }else {
                        ListNode temp = new ListNode(head2.val);
                        temp.next = head1.next;
                        head1.next = temp;
                        head1 = temp;
                        head2 = head2.next;
                    }
                } else {
                    ListNode temp = new ListNode(head1.val);
                    head1.val = head2.val;
                    temp.next = head1.next;
                    head1.next = temp;
                    head1 = temp;
                    head2 = head2.next;

                }
            }
            if (head1.next == null) {
                head1.next = head2;
            }
        }
        return newList;
    }
}
