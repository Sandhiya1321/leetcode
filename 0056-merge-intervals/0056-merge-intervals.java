class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int n=intervals.length;
        for(int i=0;i<n;i++){
            int left=intervals[i][0];
            int end=intervals[i][1];
            if(list.isEmpty()||left>list.get(list.size()-1).get(1)){
                list.add(Arrays.asList(left,end));
            }else{
                List<Integer> ans=list.get(list.size()-1);
                ans.set(1,Math.max(ans.get(1),end));
            }
        }
        int[][]  res=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            res[i][0]=list.get(i).get(0);
            res[i][1]=list.get(i).get(1);
        }
        return res;
    }
}