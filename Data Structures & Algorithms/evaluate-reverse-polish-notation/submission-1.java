class Solution {
    public int evalRPN(String[] tokens) {
    Stack<Integer> numbers = new Stack<>();
    for (int i = 0; i < tokens.length; i++) {
        if (isNumber(tokens[i])) {
            numbers.push(Integer.parseInt(tokens[i]));
        } else {
            int b = numbers.pop();
            int a = numbers.pop();
            if (tokens[i].equals("-")) {
                numbers.push(a - b);
            } else if (tokens[i].equals("*")) {
                numbers.push(a * b);
            } else if (tokens[i].equals("/") && b!=0) {
                numbers.push(a / b);
            } else if (tokens[i].equals("+")) {
                numbers.push(a + b);
            }
        }
    }
    return numbers.peek();
}

    private boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

