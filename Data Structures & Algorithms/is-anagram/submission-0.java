class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> freq =new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }

        for(char c :s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);

        }

        for(char c: t.toCharArray()){
            if(!freq.containsKey(c)){
                return false;
            }

            freq.put(c,freq.get(c)-1);
            if(freq.get(c)<0){
                return false;
            }
        }
        return true;
    }
}
