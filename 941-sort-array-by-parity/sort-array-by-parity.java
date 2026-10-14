class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            while (i < nums.length && nums[i] % 2 == 0) {
                i++;
            }

            if (nums[j] % 2 != 0) {
                continue;
            }

            if (i < nums.length && i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }

        return nums;
    }
}