class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagMap =new HashMap<>();

        for(int i=0;i<strs.length;i++){
            // get the valu short it and add that value in the map as key value pair

            //key will be the sorted one
            char[] chars =strs[i].toCharArray();
           Arrays.sort(chars);
            String sortedKey= new String( chars);
            if(!anagMap.containsKey(sortedKey)){
                List<String> temp =new ArrayList<>();
                temp.add(strs[i]);
                anagMap.put(sortedKey,temp);
            }else{
                List<String> temp =anagMap.get(sortedKey);
                temp.add(strs[i]);
                anagMap.put(sortedKey,temp);
            }
        } 

        List<List<String>> result=new ArrayList<>();
        for(Map.Entry<String,List<String>> entry :anagMap.entrySet()){

            String key =entry.getKey();
            List<String> angList = entry.getValue();
            result.add(angList);
        }

        return result;
    }
}
