class Solution {
    private String reverse(String res) {
        StringBuilder input1 = new StringBuilder();
        input1.append(res);
        input1.reverse();
        return input1.toString();
    }

    public String reverseWords(String s) {
        String e = "";
        int x = 0;
        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == ' ') {
                e = e + reverse(s.substring(x, i)) + ' ';
                x = i + 1;
            }
        }
        return e.trim();
    }
}
