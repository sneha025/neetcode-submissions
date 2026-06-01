class Solution {
    public int characterReplacement(String s, int k) {

       int i=0;
    
       int j=0;
       int tempk=k;
       int longestrep=0;
       while(j<s.length()){
        int mostFreChar = maxfrequency(s.substring(i,j+1));
        if((j-i+1)-mostFreChar<=k ){
            longestrep =Math.max(longestrep,j-i+1);
           
        }else{
            i++;
        }
        j++;

       }
       return longestrep;
       
    }

    public int maxfrequency(String s){
        HashMap<Character,Integer> freqMap = new HashMap<>();

        char morefrequest=' ';
        int morecount =0;
       
        
        for(char c :s.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        // there will be two characters so
       for(Map.Entry<Character,Integer> entry :freqMap.entrySet()){

         if(entry.getValue()>morecount){
            morecount = entry.getValue();
            morefrequest=entry.getKey();
         }
       }
       return morecount;
    }

}
