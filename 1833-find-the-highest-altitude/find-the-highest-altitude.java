class Solution {
    public int largestAltitude(int[] gain) {
        int largal=Integer.MIN_VALUE;
        int curral=0;
        for(int i=0;i<gain.length;i++){
            largal=Math.max(largal,curral);
            curral+=gain[i];
        }
        largal=Math.max(largal,curral);
        return largal;
    }
}