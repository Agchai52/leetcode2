class MyStack {
    private Queue<Integer> q = new LinkedList<>();
    private Queue<Integer> cache = new LinkedList<>();

    /** Initialize your data structure here. */
    public MyStack() {
        
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int res = top();
        if (!q.isEmpty()) {
            q.remove();
        }
        while(!cache.isEmpty()) {
            q.add(cache.remove());
        }
        return res;
        
    }
    
    /** Get the top element. */
    public int top() {
        int len = q.size();
        for (int i = 0; i < len - 1; i++)
            cache.add(q.remove());
        return q.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty() && cache.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
