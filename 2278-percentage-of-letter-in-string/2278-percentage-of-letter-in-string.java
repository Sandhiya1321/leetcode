class Solution {
    public int percentageLetter(String s, char letter) {
     int count=s.length();
     int count1=counter(s,letter);

     int percentage=(count1*100)/count;
     return percentage;
    
    }
    public static int counter(String s,char letter){
        
         int count1=0;
         for(int i=0;i<s.length();i++){
        if(s.charAt(i)==letter){
            count1++;
        }
     }   
     return count1;
    }

}