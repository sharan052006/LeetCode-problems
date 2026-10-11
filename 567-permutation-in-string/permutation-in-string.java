
import java.util.Arrays;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();

        if (k > s2.length()) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (int i = 0; i < k; i++) {
            freq1[s1.charAt(i) - 'a']++;
        }

        int temp = 0;

        for (int i = 0; i < s2.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;
            temp++;

            if (temp == k) {
                if (Arrays.equals(freq1, freq2)) {
                    return true;
                }

                freq2[s2.charAt(i - k + 1) - 'a']--;
                temp--;
            }
        }

        return false;
    }
}
