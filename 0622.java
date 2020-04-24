class MyCircularQueue {
    private int[] array;
    private int head, tail, len, capacity; 

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        array = new int[k];
        capacity = k;
        head = 0;
        tail = 0;
        len = 0;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull()) return false;
        tail %= this.capacity;
        array[this.tail] = value;
        tail++;        
        len++;
        return true;
        
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()) return false;
        head %= capacity;
        array[head] = 0;
        head++;        
        len--;
        return true;
        
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty()) return -1;
        return array[head];
        
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty()) return -1;
        return array[tail-1];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return (len == 0);
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (len == capacity);
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
