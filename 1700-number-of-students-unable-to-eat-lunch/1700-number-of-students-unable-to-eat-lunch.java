class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count0=0;
        int count1=0;
        for(int num:students){
            if(num==0) count0++;
            else count1++;
        }

        for(int num:sandwiches){
            if(num==0&&count0>0) count0--;
            else if(num==1&&count1>0) count1--;
            else break;
        }
        return count0+count1;
    }
}