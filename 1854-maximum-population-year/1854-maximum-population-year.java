class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] pop=new int[101];

        for(int[] num:logs){
            pop[num[0]-1950]++;
            pop[num[1]-1950]--;
        }
        int max=1950;
        int maxPop=0;
        int cur=0;
        for(int i=0;i<101;i++){
            cur+=pop[i];
            if(cur>maxPop){
                maxPop=cur;
                max=i+1950;
            }
        }
        return max;
    }
}