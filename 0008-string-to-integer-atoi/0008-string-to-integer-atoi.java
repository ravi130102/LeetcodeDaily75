class Solution {
    public int myAtoi(String s) {
        int i = 0;
        // Skip leading whitespaces
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
        
        if (i >= s.length()) {
            return 0; // If the string contains only whitespaces, return 0
        }
        
        int sign = 1;
        // Check for sign
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '+') ? 1 : -1;
            i++;
        }
        
        long num = 0; // Use long to handle overflow cases
        // Convert string to integer
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            if (num * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE; // Handle overflow for positive numbers
            } else if (num * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE; // Handle overflow for negative numbers
            }
            i++;
        }
        
        return (int) (num * sign);
    }
}
