class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res=new int[n*2];
        int p1=0;
        int p2=n;
        for(int i=0;i<n*2;i+=2){
            res[i]=nums[p1];
            res[i+1]=nums[p2];
            p1++;
            p2++;
        }
        return res;
    }
}