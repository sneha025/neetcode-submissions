class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int k =s1.length();
        int i=0;
        int j=0;
        while( j<s2.length()){
            if(j-i+1==k){
                if(ispermulation(s1,s2.substring(i,j+1))){
                    return true;
                }
                j++;
                i++;
            }
            else if(j-i+1<k){
                j++;
            }
        }
        return false;

    }

    public boolean ispermulation(String s1, String s2){

        int[] freq =new int[26];

        for(char c:s1.toCharArray()){
            freq[c-'a']++;
        }
          for(char c:s2.toCharArray()){
            freq[c-'a']--;
        }

        for(int c:freq){
            if(c!=0){
                return false;
            }
        }

        return true;
    }
}
