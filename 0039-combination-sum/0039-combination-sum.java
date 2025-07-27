class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        helpfun(candidates,target,0,new ArrayList<>(),result);
        return result;
    }
    public void helpfun(int[] candidates,int target,int start,List<Integer> list,List<List<Integer>> ans){
        if(target==0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if(target<0) return;


        for(int i=start;i<candidates.length;i++){
            list.add(candidates[i]);
            helpfun(candidates,target-candidates[i],i,list,ans);
            list.remove(list.size()-1);
        }
    }
}