class Solution {
    public boolean isPalindrome(String s) {

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        char[] validpal = cleaned.trim().toCharArray();

       for(int i=0,j=cleaned.length()-1;i<j;j--,i++){
        if(validpal[i]!=validpal[j]){
            return false;
        }
       }
       return true;
    }
}
