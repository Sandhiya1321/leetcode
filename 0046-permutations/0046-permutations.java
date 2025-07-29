class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helpfun(nums,new ArrayList<>(),ans);
        return ans;
    }

    public void helpfun(int[] nums,List<Integer> temp,List<List<Integer>> res){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int num:nums){
            if(temp.contains(num)){
                continue;
            }
            temp.add(num);
            helpfun(nums,temp,res);
            temp.remove(temp.size()-1);
        }
    }
}