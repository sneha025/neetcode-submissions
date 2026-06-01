class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

               // sort the array
               Arrays.sort(nums);
               List<List<Integer>> output =new ArrayList<>();

               // now it shorted, use the 3 pointer 
            int n =nums.length;

               for(int i=0;i<n-2;i++){

                    if(i>0 && nums[i]== nums[i-1]){
                        continue;
                    }

                    int l=i+1;
                    int r = n-1;

                    while(l<r){
                        int sum = nums[i]+nums[l]+nums[r];
                        if(sum>0){
                            r--;
                        }else if(sum<0){
                            l++;
                        }else{
                            output.add(Arrays.asList(nums[i],nums[l],nums[r]));
                                l++;
                            
                            while(nums[l]==nums[l-1] && l<r){
                                l++;
                            }
                        }
                    }
               }   

               return output;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            

        
    }
}
