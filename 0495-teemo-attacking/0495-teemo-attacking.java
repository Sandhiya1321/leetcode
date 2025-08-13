class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries==null||timeSeries.length==0||duration<=0) return 0;
        int points=0;
        for(int i=0;i<timeSeries.length-1;i++){
            int attack=timeSeries[i+1]-timeSeries[i];
            points+=Math.min(attack,duration);
        }
        points+=duration;
        return points;
    }
}