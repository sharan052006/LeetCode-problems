class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int res=0;
        HashSet<Character> set=new HashSet<>();
        while(left<s.length() && right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                res=Math.max(res,right-left);
            }
            else{
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
            }
        }
        return res;
    }
}