package leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.junit.jupiter.api.Test;

class N383_Ransom_Note {

    Solution solution = new Solution();

    @Test
    void test() {
        assertThat(solution.canConstruct("a", "b")).isFalse();
        assertThat(solution.canConstruct("aa", "ab")).isFalse();
        assertThat(solution.canConstruct("aa", "aab")).isTrue();
    }

    class Solution {

        public boolean canConstruct(String ransomNote, String magazine) {

            if (ransomNote.length() > magazine.length()) {
                return false;
            }

            Map<Character, Integer> rMap = new HashMap();
            for (char c : ransomNote.toCharArray()) {
                int characterCount = rMap.getOrDefault(c, 0);
                rMap.put(c, characterCount + 1);
            }

            Map<Character, Integer> mMap = new HashMap();
            for (char c : magazine.toCharArray()) {
                int characterCount = mMap.getOrDefault(c, 0);
                mMap.put(c, characterCount + 1);
            }

            for (Entry<Character, Integer> entry : rMap.entrySet()) {
                Integer valueToCompare = mMap.get(entry.getKey());
                if (valueToCompare == null) {
                    return false;
                }

                if (entry.getValue() > valueToCompare) {
                    return false;
                }
            }

            return true;
        }
    }
}
