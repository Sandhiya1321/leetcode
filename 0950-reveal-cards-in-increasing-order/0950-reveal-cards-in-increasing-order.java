class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> deque=new LinkedList<>();
        for(int i=deck.length-1;i>=0;i--){
            if(!deque.isEmpty()){
                deque.addFirst(deque.removeLast());
            }
            deque.addFirst(deck[i]);
        }
        int[] res=new int[deck.length];
        int i=0;
        for(int num:deque){
           res[i++]=num;
        }
        return res;
    }
}