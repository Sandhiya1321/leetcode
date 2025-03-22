class Solution {
    public boolean isPalindrome(int x) {
        int n=0;
        int temp=x;
        if(x<0){
            return false;
        }
        while(x>0){
            int digit=x%10;
            n=n*10+digit;
            x=x/10;
        }
        if(temp==n){
            return true;
        }
        else{
            return false;
        }
    }
}