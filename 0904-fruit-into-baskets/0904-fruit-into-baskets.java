class Solution {
    public int totalFruit(int[] fruits) {
        int max=0;
        int lastFru=-1;
        int secondlast=-1;
        int count=0;
        int curcount=0;
        for(int fruit:fruits){
            if(fruit==lastFru||fruit==secondlast){
                curcount++;
            }else{
                curcount=count+1;
            }
            if(fruit==lastFru){
                count++;
            }else{
                count=1;
                secondlast=lastFru;
                lastFru=fruit;
            }
            max=Math.max(max,curcount);
        }
        return max;
    }
}