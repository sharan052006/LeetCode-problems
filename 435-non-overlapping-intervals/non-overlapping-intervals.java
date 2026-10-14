import java.util.*;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] prev = res.get(res.size() - 1);
            int[] curr = intervals[i];

            if (curr[0] >= prev[1]) {
                res.add(curr);
            }
        }

        return intervals.length - res.size();
    }
}