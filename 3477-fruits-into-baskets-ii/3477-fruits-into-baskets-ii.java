class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] bas=new boolean[baskets.length];
        int count=0;
        for(int fruit:fruits){
            boolean fru=false;
            for(int i=0;i<baskets.length;i++){
            if(!bas[i]&&baskets[i]>=fruit){
                bas[i]=true;
                fru=true;
                break;
            }
        }
        if(!fru){
            count++;
        }
        }
        return count;
    }
}