class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        for(int i=0;i<candies.length-1;i++){
            if((candies[i]+extraCandies)>candies[i+1]){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}