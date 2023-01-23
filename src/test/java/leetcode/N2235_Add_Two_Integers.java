package leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class N2235_Add_Two_Integers {

    Solution solution = new Solution();

    @Test
    void test() {
        assertThat(solution.sum(12, 5)).isEqualTo(17);
        assertThat(solution.sum(-10, 4)).isEqualTo(-6);
    }

    class Solution {

        public int sum(int num1, int num2) {
            return num1 + num2;
        }
    }
}
