class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n = neededTime.length;
        int i = 0;
        int ans = 0;
        while(i<n){
            if(i+1<n && colors.charAt(i) == colors.charAt(i+1)){
                int max = neededTime[i];
                while(i+1<n && colors.charAt(i) == colors.charAt(i+1)){
                    ans += Math.min(max, neededTime[i+1]);
                    max = Math.max(max, neededTime[i+1]);
                    i++;
                }
                i--;
            }
            i++;
        }
        return ans;
    }
}