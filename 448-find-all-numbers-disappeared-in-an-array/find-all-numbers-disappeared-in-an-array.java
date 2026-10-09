class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int j=1;j<=nums.length;j++){
            if(set.contains(j)){
                continue;
            }
            arr.add(j);
        }
        return arr;
    }
}