class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer> list=new ArrayList<>();
        int back=0;
        int curr=1;
        int front=2;
        while(curr<=mountain.length-2)
        {
            if(mountain[curr]>mountain[back] && mountain[curr]>mountain[front])
            {
                list.add(curr);
            }
            curr++;
            back++;
            front++;
        }
        return list;
    }
}