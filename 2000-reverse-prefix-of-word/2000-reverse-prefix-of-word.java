class Solution {
        private String reverse(String s){
              StringBuilder str = new StringBuilder();
             str.append(s);
             str.reverse();
                return str.toString();
        }
    public String reversePrefix(String word, char ch) {
          String res = "";
        for(int i = 0;i< word.length();i++){
                if(word.charAt(i) == ch){
                  res = reverse(word.substring(0,i+1))+ word.substring(i+1,word.length());
                  return res ;
                }
        }
        return word;
    }
}