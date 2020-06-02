package cn.yangwanhao.leetcode;

import lombok.ToString;

/**
 * description AddTwoNumber类
 *
 * @author 杨万浩
 * @date 2020/5/29 11:10
 */
public class NormalAddTwoNumber {

    public static void main(String[] args) {
        /*
         * 给出两个非空链表来表示两个非负的整数如(3->2->5)和(4->2->1->5)
         * 他们各自的位数是按照逆序的方式存储的，切每个节点只能存储一位数字
         * 将这两个数字加起来返回一个新的链表表示它们的和
         * 如上面两个链表的结果是(7->4->6->5) 5124 + 523 = 7465
         */
        // 得到链表(3->2->5)
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        // 得到链表(4->2->1->5)
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(2);
        ListNode node6 = new ListNode(1);
        ListNode node7 = new ListNode(5);
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        // 调用方法计算并输出
        ListNode result = addTwoNumbers(node1, node4);
        System.out.println(result);
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 定义一个进位数
        int num = 0;
        // 定义一个链表头
        ListNode headNode = new ListNode(0);
        // 定义一个node存储当前结果
        ListNode node = new ListNode(0);
        // 连接
        headNode.next = node;
        do {
            // 两数相加
            int result = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + num;
            // 判断是否需要进位
            num = result / 10;
            // 结果对10取余
            node.val = result % 10;
            // 把l1和l2向后推进一步
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            // 把结果链也向后推进一步
            if (l1 != null || l2 != null || num != 0) {
                node.next = new ListNode(0);
                node = node.next;
            }
        } while(l1 != null || l2 != null || num != 0);
        return headNode.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode node = this;
        String concatOperate = "->";
        do {
            sb.append(node.val);
            if (null != node.next) {
                sb.append(concatOperate);
            }
            node = node.next;
        } while (node != null);
        return sb.toString();
    }
}