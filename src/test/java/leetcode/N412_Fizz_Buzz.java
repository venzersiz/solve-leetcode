package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class N412_Fizz_Buzz {

    Solution solution = new Solution();

    @Test
    void test() {
        Assertions.assertThat(solution.fizzBuzz(3)).isEqualTo(Arrays.asList("1", "2", "Fizz"));
        Assertions.assertThat(solution.fizzBuzz(5)).isEqualTo(Arrays.asList("1", "2", "Fizz", "4", "Buzz"));
        Assertions.assertThat(solution.fizzBuzz(15)).isEqualTo(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"));
    }

    class Solution {

        public List<String> fizzBuzz(int n) {
            List<String> output = new ArrayList<>(n);

            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0) {
                    stringBuilder.append("Fizz");
                }

                if (i % 5 == 0) {
                    stringBuilder.append("Buzz");
                }

                if (stringBuilder.length() == 0) {
                    stringBuilder.append(i);
                }

                output.add(stringBuilder.toString());
                stringBuilder.setLength(0);
            }

            return output;
        }
    }
}
