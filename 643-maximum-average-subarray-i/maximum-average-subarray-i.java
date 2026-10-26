class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int res=sum;
        for(int j=k;j<nums.length;j++){
            sum=sum - nums[j-k] + nums[j];
            res=Math.max(sum,res);

        }
        return (double)res/k;
    }
}