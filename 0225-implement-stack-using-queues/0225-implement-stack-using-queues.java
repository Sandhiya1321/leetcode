class MyStack {
    private Queue<Integer> one;
    private Queue<Integer> two;

    public MyStack() {
        one=new LinkedList<>();
        two=new LinkedList<>();
    }
    
    public void push(int x) {
        two.add(x);
        while(!empty()){
            two.add(pop());
        }
        Queue<Integer> temp=one;
        one=two;
        two=temp;
    }
    
    public int pop() {
        return one.remove();
    }
    
    public int top() {
        return one.peek();
    }
    
    public boolean empty() {
        return one.isEmpty();
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