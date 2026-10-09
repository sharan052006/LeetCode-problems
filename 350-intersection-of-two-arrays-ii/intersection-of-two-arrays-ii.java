import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
        }

        for (int j = 0; j < nums2.length; j++) {
            map2.put(nums2[j], map2.getOrDefault(nums2[j], 0) + 1);
        }

        int[] res = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        for (int num : map1.keySet()) {
            if (map2.containsKey(num)) {
                int count = Math.min(map1.get(num), map2.get(num));

                for (int i = 0; i < count; i++) {
                    res[k++] = num;
                }
            }
        }

        return Arrays.copyOf(res, k);
    }
}