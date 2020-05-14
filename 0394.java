class Solution {
    public String decodeString(String s) {
        
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c != ']') stack.push(c);
            else {
                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty() && Character.isLetter(stack.peek()))
                    sb.insert(0, stack.pop());
                if (!stack.isEmpty() && stack.peek() == '[')
                    stack.pop();
                String sub = sb.toString();
                
                sb = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek()))
                    sb.insert(0, stack.pop());
                int count = Integer.valueOf(sb.toString());
                while (count > 0) {
                    for (char ch: sub.toCharArray())
                        stack.push(ch);
                    count--;
                }
            }
        }
        
        StringBuilder res = new StringBuilder(); 
        while (!stack.isEmpty()) 
            res.insert(0, stack.pop());
        return res.toString();
        
    }
}
