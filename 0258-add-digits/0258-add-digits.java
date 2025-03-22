class Solution {
    public int addDigits(int num) {
        int n=0;
        if(num<10){
            return num;
        }
        while(num>0){
            int digit=num%10;
            n=n+digit;
            num=num/10;
            }
            return addDigits(n);
    }
}
