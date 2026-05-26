class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output =new int[2];
        HashMap<Integer,Integer> comp= new HashMap<>();

        for(int i =0;i<nums.length;i++){
            int comple =target-nums[i];
           if( !comp.containsKey(comple)){
            comp.put(nums[i],i);
           } else{
            output[0]=comp.get(comple);
            output[1]=(i);
            
            return  output;
           }
        }
        return output;
        
    }
}
