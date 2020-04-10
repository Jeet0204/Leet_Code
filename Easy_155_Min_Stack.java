class MinStack {
        List<Integer> list = new ArrayList<>();
        int count=0;


    /** initialize your data structure here. */
    public MinStack() {
    }
    
    public void push(int x) {
        list.add(x);
        count++;
    }
    
    public void pop() {
        list.remove(count-1);
        count--;
    }
    
    public int top() {
        return list.get(count-1);
    }
    
    public int getMin() {
        int min=list.get(0);
        for(int i=0;i<list.size();i++)
            if(min>list.get(i))
                min=list.get(i);
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */