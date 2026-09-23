class Solution {
    public boolean isValid(String s) {
         Stack<Character> seen=new Stack<>();
         for(char c:s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                seen.push(c);
            }else if(seen.empty()) return false;
            else if((c==')'&& seen.peek()=='(') ||
                    (c=='}'&& seen.peek()=='{') ||
                    (c==']'&& seen.peek()=='[') ){
                        seen.pop();
            
            }else {
                return false;
            }
         }
         return seen.empty();
    }
}
