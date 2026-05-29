class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j= numbers.length-1;
        int[] output = new int[2];
        while(i<j){
            int numSum =  numbers[i]+numbers[j];
             if(numSum==target){
                output[0]=i+1;
                output[1]=j+1;
                return output;
            }
            if(numSum>target){
                j--;
            }else{
                i++;
            }
           
        }
            return output;
    }

}
