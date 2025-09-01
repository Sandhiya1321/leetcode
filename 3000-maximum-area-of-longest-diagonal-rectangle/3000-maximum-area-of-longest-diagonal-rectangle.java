class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxD=0;
        int max=0;

        for(int[] num:dimensions){
            int length=num[0];
            int width=num[1];
            double dig=Math.sqrt(length*length+width*width);
            int area=length*width;
            if(dig>maxD){
                maxD=dig;
                max=area;
            }else if(dig==maxD){
                max=Math.max(max,area);
            }
        }
        return max;
    }
}