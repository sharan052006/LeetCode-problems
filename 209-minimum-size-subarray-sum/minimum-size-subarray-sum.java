class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int sum=0;
        int res=Integer.MAX_VALUE;
        while(j<nums.length ){
            if(sum<target){
                sum+=nums[j];
                j++;
            }
            else{
                if(res>j-i){
                    res=j-i;
                }
                sum-=nums[i];
                i++;
            }
        }
        while (i < j && sum >= target) {
            if(res>j-i){
                res=j-i;
            }
            sum -= nums[i];
            i++;
        }
        if(res==Integer.MAX_VALUE){
            return 0;
        }
        return res;
    }
}