class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1=rev(num);
        int rev2=rev(rev1);
        return (num==rev2)?true:false;
    }
    public int rev(int num) {
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum*10+rem;
            num/=10;
        }
        return sum;
    }
}