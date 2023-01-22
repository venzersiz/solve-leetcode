package leetcode;

import java.util.ArrayList;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class N876_Middle_of_The_Linked_List {

    Solution solution = new Solution();

    @Test
    void test12345() {
        ListNode head = new ListNode(5);
        for (int i = 4; i >= 1; i--) {
            head = new ListNode(i, head);
        }

        ListNode middle = solution.middleNode(head);
        Assertions.assertThat(middle.val).isEqualTo(3);
        Assertions.assertThat(middle.next.val).isEqualTo(4);
        Assertions.assertThat(middle.next.next.val).isEqualTo(5);
    }

    @Test
    void test123456() {
        ListNode head = new ListNode(6);
        for (int i = 5; i >= 1; i--) {
            head = new ListNode(i, head);
        }

        ListNode middle = solution.middleNode(head);
        Assertions.assertThat(middle.val).isEqualTo(4);
        Assertions.assertThat(middle.next.val).isEqualTo(5);
        Assertions.assertThat(middle.next.next.val).isEqualTo(6);
    }

    class Solution {

        private int size;

        public ListNode middleNode(ListNode head) {

            List<ListNode> list = new ArrayList<>();

            while (head != null) {
                list.add(head);
                head = head.next;
            }

            return list.get(list.size() / 2);
        }
    }

    class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
