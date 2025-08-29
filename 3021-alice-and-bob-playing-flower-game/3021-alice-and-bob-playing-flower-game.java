class Solution {
    public long flowerGame(int n, int m) {
        long n1=(n+1)/2;
        long n2=n/2;
        long m1=(m+1)/2;
        long m2=m/2;

        return n1*n2+m1*m2;
    }
}