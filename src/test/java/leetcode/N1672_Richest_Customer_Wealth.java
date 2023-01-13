package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class N1672_Richest_Customer_Wealth {

    Solution solution = new Solution();

    @Test
    void test() {
        Assertions.assertThat(solution.maximumWealth(new int[][]{{1, 2, 3}, {3, 2, 1}})).isEqualTo(6);
        Assertions.assertThat(solution.maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}})).isEqualTo(10);
        Assertions.assertThat(solution.maximumWealth(new int[][]{{2, 8, 7}, {7, 1, 3}, {1, 9, 5}})).isEqualTo(17);
    }

    class Solution {

        public int maximumWealth(int[][] accounts) {
            int maximumWealth = 0;

            for (int i = 0; i < accounts.length; i++) {
                int wealth = 0;
                for (int j = 0; j < accounts[i].length; j++) {
                    wealth += accounts[i][j];
                }
                maximumWealth = Math.max(maximumWealth, wealth);
            }

            return maximumWealth;
        }
    }
}
