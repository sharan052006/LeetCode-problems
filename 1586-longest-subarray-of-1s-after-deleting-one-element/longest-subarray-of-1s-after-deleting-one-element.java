
class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0;
        int res = 0;
        boolean bool = false;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0 && !bool) {
                bool = true;
            } else if (nums[j] == 0 && bool) {
                res = Math.max(res, j - i - 1);

                while (nums[i] == 1) {
                    i++;
                }

                i++;
            }
        }

        res = Math.max(res, nums.length - i - 1);
        return res;
    }
}
