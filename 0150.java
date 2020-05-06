class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens == null) return 0;
        Stack<Integer> stack = new Stack<>();
        for (String s: tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                int c = 0;
                if (s.equals("+")) c = a + b;
                else if (s.equals("-")) c = a - b;
                else if (s.equals("*")) c = a * b;
                else if (s.equals("/")) c = a / b;
                stack.push(c);
            }
            else {
                int val = Integer.parseInt(s);
                stack.push(val);
            }
            
        }
        return stack.pop();
        
    }
}
