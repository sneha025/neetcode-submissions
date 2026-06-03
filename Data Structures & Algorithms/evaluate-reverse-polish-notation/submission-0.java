class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> tokenStack =new Stack<>();
        for(int i=0;i<tokens.length;i++ ){

            if(tokens[i].equals("+") && !tokenStack.isEmpty()){
                
                        int a = (tokenStack.pop());
                        int b= (tokenStack.pop());
                        tokenStack.push(a+b);
                       
                
            }else if(tokens[i].equals("*") && !tokenStack.isEmpty()){
                        int a =(tokenStack.pop());
                        int b= (tokenStack.pop());
                        tokenStack.push(a*b);
                         
            }else if(tokens[i].equals("/") && !tokenStack.isEmpty()){
                int a =(tokenStack.pop());
                        int b= (tokenStack.pop());
                        tokenStack.push(b/a);
                         
            }else if(tokens[i].equals("-") && !tokenStack.isEmpty()){
                 int a = (tokenStack.pop());
                        int b= (tokenStack.pop());
                        tokenStack.push(b-a);
                        
            }else{
                 tokenStack.push(Integer.valueOf(tokens[i]));
            }
        }
            if(!tokenStack.isEmpty()){
                 return tokenStack.pop();
            }else{
                return 0;
            }
       
    }
}
