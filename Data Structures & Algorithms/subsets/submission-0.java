class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result =new ArrayList<>();
        backTrack(nums,result,0,new ArrayList<>());
        return result;

    }

    public void backTrack(int[] nums,List<List<Integer>> result,int i,List<Integer> solution){
        if(i==nums.length){
             result.add(new ArrayList<>(solution));
             return;
        }
       

           
            solution.add(nums[i]);
            
          
            backTrack(nums,result,i+1,solution);
            solution.remove(solution.size()-1);

            backTrack(nums, result, i + 1, solution);
        

    }
}
