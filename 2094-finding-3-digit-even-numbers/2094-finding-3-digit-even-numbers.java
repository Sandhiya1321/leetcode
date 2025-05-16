class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> result=new ArrayList<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i!=j&&j!=k&&k!=i){
                         int num = digits[i] * 100 + digits[j] * 10 + digits[k];
                         if(digits[i]!=0&&digits[k]%2==0&&!result.contains(num)){
                            result.add(num);
                         }
                    }
                }
            }
        }
        Collections.sort(result);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}