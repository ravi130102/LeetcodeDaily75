class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder sb = new StringBuilder();
       int len = Math.min(word1.length(),word2.length());
       for(int i = 0;i< len;i++){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
        }
         
            if(word1.length() != word2.length()){
                    if(word1.length() > word2.length()){
                            for(  int x = len; x< word1.length() ;x++){
                                sb.append(word1.charAt(x));    
                            }
            } else{
                                    for( int x = len ; x< word2.length() ;x++){
                                sb.append(word2.charAt(x));  
                            }
                    }
            }
                    
         return sb.toString();   
    }
}