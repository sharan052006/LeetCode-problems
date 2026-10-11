class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        double avg=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        avg=sum/k;
        if(arr.length==k){
            return 1;
        }
        int c=0;
        if(avg>threshold){
            c++;
        }
        for(int j=k;j<arr.length;j++){
            sum=sum-arr[j-k]+arr[j];
            avg=(double)sum/k;
            if(avg>=threshold){
                c++;
            }
            avg=0;
        }
        return c;
    }
}