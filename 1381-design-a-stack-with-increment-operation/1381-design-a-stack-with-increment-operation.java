class CustomStack {
    private int[] stack;
    private int[] increment;
    private int max;
    private int top;
    public CustomStack(int maxSize) {
        this.max=maxSize;
        this.stack=new int[maxSize];
        this.increment=new int[maxSize];
        this.top=-1;
    }
    
    public void push(int x) {
        if(top+1<max){
            stack[++top]=x;
        }
    }
    
    public int pop() {
        if(top==-1){
            return -1;
        }
        int res=stack[top]+increment[top];
        if(top>0){
            increment[top-1]+=increment[top];
        }
        increment[top]=0;
        top--;
        return res;
    }
    
    public void increment(int k, int val) {
        int last=Math.min(k,top+1)-1;
        if(last>=0){
            increment[last]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */