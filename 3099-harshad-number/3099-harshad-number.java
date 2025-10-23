class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp=x;
        int sum=0;
        while(x>0){
            int rem=x%10;
            sum+=rem;
            x/=10;
        }
        
        return (temp%sum==0)?sum:-1;
    }
}