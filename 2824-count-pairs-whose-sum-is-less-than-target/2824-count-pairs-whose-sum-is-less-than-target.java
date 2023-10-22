class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
            for(int i =0 ;i< nums.size()-1 ;i++){
                    for(int x = i+1;x< nums.size() ;x++){
                            if(nums.get(i) + nums.get(x) < target){
                                    count++;
                            }
                    }
            }
            return count;
    }
}