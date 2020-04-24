class MovingAverage {
    private Queue<Integer> queue;
    private int capacity;
    private int len = 0;
    private int sum = 0;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        queue = new LinkedList<Integer>();
        capacity = size;        
    }
    
    public double next(int val) {
        if (len < capacity) {
            len++;
        } else {
            sum -= queue.poll();
        }
        queue.add(val);
        sum += val;
        return sum * 1.0 / len;
        
        
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
