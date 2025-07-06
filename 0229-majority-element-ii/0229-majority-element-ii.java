class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int count1=0;
        int count2=0;
        int element1=Integer.MIN_VALUE;
        int element2=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(count1==0&&nums[i]!=element2){
                count1=1;
                element1=nums[i];
            }else if(count2==0&&nums[i]!=element1){
                count2=1;
                element2=nums[i];
            }
            else if(nums[i]==element1){
                count1++;
            }else if(nums[i]==element2){
                count2++;
            }
        }
        int c1=0;
        int c2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==element1){
                c1++;
            }else if(nums[i]==element2){
                c2++;
            }
        }
        if(c1>n/3){
            list.add(element1);
        }
        if(c2>n/3){
            list.add(element2);
        }
        return list;
    }
}