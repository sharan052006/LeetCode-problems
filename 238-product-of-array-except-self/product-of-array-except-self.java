class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftprod=new int[nums.length];
        int[] rightprod=new int[nums.length];
        int prod=1;
        for(int i=0;i<nums.length;i++){
            leftprod[i]=prod;
            prod*=nums[i];
        }
        prod=1;
        for(int j=nums.length-1;j>=0;j--){
            rightprod[j]=prod * leftprod[j];
            prod*=nums[j];
        }
        return rightprod;
    }
}