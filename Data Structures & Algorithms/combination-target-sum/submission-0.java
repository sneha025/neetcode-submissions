class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
List<List<Integer>> result =new ArrayList<>();
        backTrack(nums,0,target,result,new ArrayList<>());

        return result;

        
    }

    public void backTrack(int[] nums,int i, int reminder,List<List<Integer>> result, List<Integer> solution){

        if(reminder==0){
            result.add(new ArrayList<>(solution));
            return;
        }
       
      
       if(reminder<0 || i==nums.length){
        return;
       }
        solution.add(nums[i]);

       backTrack(nums,i,reminder-nums[i],result,solution);
       solution.remove(solution.size()-1);

       backTrack(nums,i+1,reminder,result,solution);




    }
}
