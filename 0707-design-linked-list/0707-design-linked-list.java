class MyLinkedList {
    private class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }
    }
    private Node head;
    private int size;
    public MyLinkedList() {
        head=null;
        size=0;

    }
    
    public int get(int index) {
        if(index<0||index>=size){
            return -1;
        }
        Node cur=head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur.val;
    }
    
    public void addAtHead(int val) {
        Node node=new Node(val);
        node.next=head;
        head=node;
        size++;
    }
    
    public void addAtTail(int val) {
        Node node=new Node(val);
        if(head==null){
            head=node;
        }
        else{
            Node cur=head;
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=node;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;
        if(index==0){
            addAtHead(val);
            return;
        }
        
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        Node node=new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index<0||index>=size){
            return;
        }
        if(index==0){
            head=head.next;
        }
        else{
            Node cur=head;
            for(int i=0;i<index-1;i++){
                cur=cur.next;
            }
            cur.next=cur.next.next;
        }
        size--;  
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */