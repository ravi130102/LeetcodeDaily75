class Solution {
        public static String longestPalindrome(String s){
        if(s == null|| s.length() <1){
            return "";
        }
        if(s.length() == 1){
            return s;
        }
        int start =0;
        int substrLen = 0;
        for(int i=0;i<s.length();i++){
            int len1 = expandAroundCenter(s,i,i);
            int len2 = expandAroundCenter(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len> substrLen){
                start =i -(len-1)/2;
                substrLen = len;
            }
        }
        return s.substring(start,start+substrLen);
    }
    private static int expandAroundCenter(String input, int left, int right){
        while (left>= 0 && right < input.length() && input.charAt(left)== input.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}