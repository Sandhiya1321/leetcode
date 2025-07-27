class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List<List<Integer>> result=new ArrayList<>();
         Arrays.sort(candidates);
        helpfun(candidates,target,0,new ArrayList<>(),result);
        return result;
    }
     public void helpfun(int[] candidates,int target,int start,List<Integer> list,List<List<Integer>> ans){
        if(target==0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=start;i<candidates.length;i++){
            if(i > start && candidates[i]==candidates[i-1]) continue;

            if(candidates[i] > target) break;

            list.add(candidates[i]);
            helpfun(candidates,target-candidates[i],i+1,list,ans);
            list.remove(list.size()-1);
        }
    }
}