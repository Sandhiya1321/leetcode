class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> ans=new HashSet<>();
        Set<Integer> cur=new HashSet<>();

        for(int num:arr){
            Set<Integer> next=new HashSet<>();
            next.add(num);
            for(int i:cur){
                next.add(i|num);
            }
            cur=next;
            ans.addAll(cur);
        }
        return ans.size();
    }
}