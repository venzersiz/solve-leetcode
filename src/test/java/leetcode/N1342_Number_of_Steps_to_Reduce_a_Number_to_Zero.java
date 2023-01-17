package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class N1342_Number_of_Steps_to_Reduce_a_Number_to_Zero {

    Solution solution = new Solution();

    @Test
    void test() {
        Assertions.assertThat(solution.numberOfSteps(14)).isEqualTo(6);
        Assertions.assertThat(solution.numberOfSteps(8)).isEqualTo(4);
        Assertions.assertThat(solution.numberOfSteps(123)).isEqualTo(12);
    }

    class Solution {

        public int numberOfSteps(int num) {

            int steps = 0;

            while (num > 0) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num--;
                }
                steps++;
            }

            return steps;
        }
    }
}
