class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        int[] nums2=new int[101];
        for(int i=nums.length-1;i>=0;--i){
            count=count+nums2[nums[i]];
            ++nums2[nums[i]];
        }
        return count;
    }
}