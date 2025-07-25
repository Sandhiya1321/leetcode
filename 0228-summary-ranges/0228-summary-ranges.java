class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        int n=nums.length;
        if(n==0) return list;
        int first=nums[0];

        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]+1){
                if(first==nums[i-1]){
                    list.add(String.valueOf(first));
                }else{
                    list.add(first+"->"+nums[i-1]);
                }
                first=nums[i];
            }
        }
        if(first==nums[n-1]){
            list.add(String.valueOf(first));
        }else{
            list.add(first+"->"+nums[n-1]);
        }
        return list;
    }
}