class Solution {
    public int numberOfSteps(int num) {
        return helpfunc(num,0);
    }
    public int helpfunc(int num,int step){
        if(num==0){
            return step;
        }
        if(num%2==0){
            return helpfunc(num/2,step+1);
        }
        return helpfunc(num-1,step+1);
    }
}