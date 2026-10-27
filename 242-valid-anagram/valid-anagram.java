class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            freq1[s.charAt(i)-'a']++;
            freq2[t.charAt(i)-'a']++;
        }
        for(int j=0;j<s.length();j++){
            if(freq1[s.charAt(j)-'a']!=freq2[s.charAt(j)-'a']){
                return false;
            }
        }
        return true;

    }
}