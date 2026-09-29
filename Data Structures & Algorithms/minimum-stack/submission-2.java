class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minValues;
    
    public MinStack() {
        stack=new Stack<>();
        minValues=new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minValues.empty() || val<=minValues.peek()){
            minValues.push(val);
        }
    }
    
    public void pop() {    
        if(!stack.empty()){
            int val=stack.pop();
            if(val==minValues.peek()){
                minValues.pop();
            }
        }    
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minValues.peek();
    }
}
