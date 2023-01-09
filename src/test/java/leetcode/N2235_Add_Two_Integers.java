package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class N2235_Add_Two_Integers {

    class Solution {
        public int sum(int num1, int num2) {
            return num1 + num2;
        }
    }

    @Test
    void test() {
        Solution solution = new Solution();
        Assertions.assertThat(solution.sum(12, 5)).isEqualTo(17);
        Assertions.assertThat(solution.sum(-10, 4)).isEqualTo(-6);
    }
}
