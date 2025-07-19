class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenC=0;
        int oddC=0;

        for(int num:position){
            if(num%2==0){
                evenC++;
            }else{
            oddC++;
            }
        }
        return Math.min(evenC,oddC);
    }
}