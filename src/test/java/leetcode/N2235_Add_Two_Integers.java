package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class N2235_Add_Two_Integers {

    Solution solution = new Solution();

    @Test
    void test() {
        Assertions.assertThat(solution.sum(12, 5)).isEqualTo(17);
        Assertions.assertThat(solution.sum(-10, 4)).isEqualTo(-6);
    }

    class Solution {

        public int sum(int num1, int num2) {
            return num1 + num2;
        }
    }
}
