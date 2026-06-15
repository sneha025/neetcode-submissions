class Solution {
    public int findDuplicate(int[] nums) {

        for(int i=0;i<nums.length;i++){
            int indx =Math.abs(nums[i])-1;
          if(nums[indx]<0){
                return indx+1;
          }else{
            nums[indx]*=-1;
          }
        }
        return 0;
    }
}
