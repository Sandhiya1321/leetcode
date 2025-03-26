class Solution {
    public boolean backspaceCompare(String s, String t) {
        int left=s.length()-1;
        int right=t.length()-1;
        int storeS=0;
        int storeT=0;
        while(left>=0||right>=0){
            while(left>=0){
                if(s.charAt(left)=='#'){
                    storeS++;
                    left--;
                }
                else if(storeS>0){
                    storeS--;
                    left--;
                }
                else{
                    break;
                }
            }
            while(right>=0){
                if(t.charAt(right)=='#'){
                    storeT++;
                    right--;
                }
                else if(storeT>0){
                    storeT--;
                    right--;
                }
                else{
                    break;
                }
            }
            if(left>=0&&right>=0&&s.charAt(left)!=t.charAt(right)){
                return false;
            } 
            if((left>=0)!=(right>=0)){
                return false;
            }   
              
            left--;
             right--;
        }
        
        return true;
    }
}