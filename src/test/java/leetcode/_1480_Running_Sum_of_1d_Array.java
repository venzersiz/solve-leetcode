package leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class _1480_Running_Sum_of_1d_Array {

    Solution solution = new Solution();

    @Test
    void runningSum() {
        assertThat(solution.runningSum(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{1, 3, 6, 10});
        assertThat(solution.runningSum(new int[]{1, 1, 1, 1, 1})).isEqualTo(new int[]{1, 2, 3, 4, 5});
        assertThat(solution.runningSum(new int[]{3, 1, 2, 10, 1})).isEqualTo(new int[]{3, 4, 6, 16, 17});
    }

    @Test
    void runningSumInPlace() {
        assertThat(solution.runningSumInPlace(new int[]{1, 2, 3, 4})).isEqualTo(new int[]{1, 3, 6, 10});
        assertThat(solution.runningSumInPlace(new int[]{1, 1, 1, 1, 1})).isEqualTo(new int[]{1, 2, 3, 4, 5});
        assertThat(solution.runningSumInPlace(new int[]{3, 1, 2, 10, 1})).isEqualTo(new int[]{3, 4, 6, 16, 17});
    }

    class Solution {

        /**
         * 시간 복잡도: O(N)
         * 공간 복잡도: O(1)
         */
        public int[] runningSum(int[] nums) {

            int[] output = new int[nums.length];

            output[0] = nums[0];

            for (int i = 1; i < nums.length; i++) {
                output[i] = output[i - 1] + nums[i];
            }

            return output;
        }

        /**
         * 시간 복잡도: O(N)
         * 공간 복잡도: O(1) // TODO: 왜 그런지 이해가 아직 잘 모르겠음
         */
        public int[] runningSumInPlace(int[] nums) {

            for (int i = 1; i < nums.length; i++) {
                nums[i] = nums[i - 1] + nums[i];
            }

            return nums;
        }
    }
}
