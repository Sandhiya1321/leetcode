class Solution {
    public void duplicateZeros(int[] arr) {
        int dup=0;
        int len=arr.length;

        for(int i=0;i<len-dup;i++){
            if(arr[i]==0){
                if(i==len-dup-1){
                    arr[i-1]=0;
                    len--;
                    break;
                }
                dup++;
            }
        }
        for(int i=len-dup-1;i>=0;i--){
           if(arr[i]==0){
            arr[i+dup]=0;
            dup--;
            arr[i+dup]=0;
           }else{
            arr[i+dup]=arr[i];
           } 
        }
    }
}