class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == currentChar) {
                sb.deleteCharAt(sb.length() - 1);
            }
            else {
                sb.append(currentChar);
            }
        }
        return sb.toString(); 
    }
}
