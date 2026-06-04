class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        HashMap<Integer,Double> speedMap = new HashMap<>();

        for(int i =0;i<position.length;i++){
                speedMap.put(position[i],(double)(target-position[i])/speed[i]);
        }

//sort the map
        int result =0;
         Stack<Double> stack =new Stack<>();
         List<Map.Entry<Integer,Double>>cars = new ArrayList<>(speedMap.entrySet());

         cars.sort((a,b)->b.getKey()-a.getKey());
        for(Map.Entry<Integer,Double> entry: cars){
           if(stack.isEmpty() ||  stack.peek()<entry.getValue()){
         
             stack.push(entry.getValue());
           }
           
        }

        if(!stack.isEmpty()){
            result =stack.size();
        }
        return result;
    }
}
