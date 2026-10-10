class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        if(nums.length==k){
            return (double)sum/k;
        }
        int maxsum=sum;
        for(int j=k;j<nums.length;j++){
            sum=sum-nums[j-k]+nums[j];
            maxsum=Math.max(maxsum,sum);
        }
        return (double)maxsum/k;

    }
}