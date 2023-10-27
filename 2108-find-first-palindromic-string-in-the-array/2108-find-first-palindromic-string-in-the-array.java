class Solution {
    private String check(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();
        if (reversed.equals(s)) {
            return s;
        }
        return "";
    }

    public String firstPalindrome(String[] words) {
        String str = "";
        for (int i = 0; i < words.length; i++) {
            str = check(words[i]);
            if (str.length() > 0) {
                return str;
            }
        }
        return str;
    }
}
