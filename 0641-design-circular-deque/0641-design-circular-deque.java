class MyCircularDeque {
    int[] data;
    int head;
    int end;
    int capacity;
    int size;
    public  MyCircularDeque(int k) {
        data=new int[k];
        head=0;
        end=0;
        capacity=k;
        size=0;
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;
        
        head=(head-1+capacity)%capacity;
        data[head]=value;
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()) return false;
        data[end]=value;
        end=(end+1)%capacity;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()) return false;

        head=(head+1)%capacity;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()) return false;

        end=(end-1+capacity)%capacity;
        size--;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()) return -1;
        return data[head];
    }
    
    public int getRear() {
        if(isEmpty()) return -1;
        return data[(end-1+capacity)%capacity];
    }
    
    public boolean isEmpty() {
         return size==0;
    }
    
    public boolean isFull() {
        return size==capacity;
    }
}


/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */