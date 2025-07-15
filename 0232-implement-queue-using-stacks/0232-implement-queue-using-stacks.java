class MyQueue {
    private Stack<Integer> one;
    private Stack<Integer> two;
    public MyQueue() {
        one=new Stack<>();
        two=new Stack<>();
    }
    
    public void push(int x) {
        one.push(x);
    }
    
    public int pop() {
        need();
        return two.pop();
    }
    
    public int peek() {
        need();
        return two.peek();
    }
    
    public boolean empty() {
        return one.empty()&&two.empty();
    }
    public void need(){
        if(two.empty()){
            while(!one.empty()){
                two.push(one.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */