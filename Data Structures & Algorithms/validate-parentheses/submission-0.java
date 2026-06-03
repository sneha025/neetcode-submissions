class Solution {
    public boolean isValid(String s) {
         HashMap<Character,Character> paran=new HashMap<>();
        paran.put('(',')');
        paran.put('[',']');
        paran.put('{','}');     
    

    Stack<Character> pranStack=new Stack<>();

        for(char c: s.toCharArray()){
            if(paran.containsKey(c)){
                // means it's paranthesis now we will  put in the stack and if we find the element on the top 
                pranStack.push(c);

            }else{
                if(!pranStack.isEmpty()){
                 char opening = pranStack.peek();

                if(c==paran.get(opening)){
                    //it's vlaid we pop that elment
                    pranStack.pop();
                }else{
                    return false;
                }
                }else{
                    return false;
                }
               
            }
        }
        if(pranStack.isEmpty()){
            return true;
        }else{
          return false;
        }
       
    }
}
