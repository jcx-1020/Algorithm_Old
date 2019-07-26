package leetcode;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        //头结点
        ListNode heard = new ListNode(0);
        //p初始化为l1，q初始化为l2，temp初始化为heard
        ListNode p = l1, q = l2, temp = heard;
        //存储两结点求和后 溢出 的值，在下一个结点求和是应用
        int num = 0;
        //遍历
        while (p != null || q != null) {
            //判断结点是否为空，为空取0，不为空取val
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            //两结点值与 溢出 值求和
            int sum = num + x + y;
            //使结点 溢出 值为当前两结点的
            num = sum / 10;
            //存储sum的个位数值在新节点中，加入链表中
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        //如果 溢出 值不为0，把其存入新节点，加入链表中
        if (num > 0) {
            temp.next = new ListNode(num);
        }
        //返回头结点下一个
        return heard.next;

    }
}
