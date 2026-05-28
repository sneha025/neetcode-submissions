class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prodPref=new int[nums.length];
          int[] prodSuff=new int[nums.length];
          prodPref[0]=1;
          prodSuff[nums.length-1]=1; 

          for(int i=1;i<nums.length;i++){
            prodPref[i]=prodPref[i-1]*nums[i-1];
    
          }
          for(int i=nums.length-2; i>=0;i--){
            prodSuff[i]=prodSuff[i+1]*nums[i+1];
          }

          int[] output = new int[nums.length];

          for(int i =0;i<nums.length;i++){
           
            output[i]=prodSuff[i]*prodPref[i];
          }

          return output;

    }
}  
