package leetcode_cn;

import org.junit.Test;

/**
 * 2. 两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class NO2 {
    /**
     * 下面的方法是自己写的，有一步可以优化就是不需要分“位数相同的相加”，“位数大的再追加”
     * 将“位数大的”在循环内部判断即可，把循环的条件改为短路或。
     */
    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(-1);
        ListNode point = result;
        // 1. 位数相同的相加
        int up = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + up; // 两个节点相加再加进位
            up = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            point.next = newNode;
            point = point.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        // 2. 位数多的不再相加，直接追加到链表
        while (l1 != null) {
            int sum = l1.val + up;
            up = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            point.next = newNode;
            point = point.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int sum = l2.val + up;
            up = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            point.next = newNode;
            point = point.next;
            l2 = l2.next;

        }
        // 3. 最后一个如果还有进位，再链上。
        if (up != 0) {
            ListNode newNode = new ListNode(up);
            point.next = newNode;
        }
        return result.next;
    }

    @Test
    public void test() {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);
        addTwoNumbers(l1, l2);
        System.out.println();
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
/**
 * 说明：
 * 这道题目是“链表”的题目，链表的题目经常就是按照实际情况一步一步来，代码可以按照画图来一步一步写出来即可。
 */