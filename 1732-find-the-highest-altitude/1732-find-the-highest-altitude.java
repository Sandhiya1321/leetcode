class Solution {
    public int largestAltitude(int[] gain) {
       int max=0;
       int altitude=0; 
       for(int i:gain){
        altitude+=i;
        max=Math.max(max,altitude);
       }
       return max;
    }
}