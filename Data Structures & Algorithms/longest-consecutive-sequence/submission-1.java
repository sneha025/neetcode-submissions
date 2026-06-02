class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashMap<Integer,Integer> consec =new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(!consec.containsKey(nums[i])){
                consec.put(nums[i],nums[i]+1);
            }
        }
        int maxLength = 0;
        for(Map.Entry<Integer, Integer> entry: consec.entrySet()){
                int key = entry.getKey();
                int value =entry.getValue();
                int length =1;
                       while(consec.containsKey(value)){
                            length++;
                            value++;
                       }
                       maxLength =Math.max(length,maxLength);
                    
                
        }
        return maxLength;
    }
}
