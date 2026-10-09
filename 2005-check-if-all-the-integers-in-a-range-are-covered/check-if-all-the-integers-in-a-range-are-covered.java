class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        while(left<=right){
            Boolean bool=false;
            for(int i=0;i<ranges.length;i++){
                if(left>=ranges[i][0] && left<=ranges[i][1]){
                    bool=true;
                }
            }
            if(!bool){
                return false;
            }
            left++;
        }
        return true;
    }
}