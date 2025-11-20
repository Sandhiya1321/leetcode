class Solution {
    public int maxPower(String s) {
        int count=1;
        int max=1;
        char[] ch=s.toCharArray();
        for(int i=1;i<ch.length;i++){
            if(ch[i]==ch[i+1]){
                count++;
                max=Math.max(max,count);
            }else{
                count=1;
            }
        }
        return max;
    }
}