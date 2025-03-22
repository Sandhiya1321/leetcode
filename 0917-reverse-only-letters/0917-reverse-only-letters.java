class Solution {
    public String reverseOnlyLetters(String s) {
     char ch[]=s.toCharArray();
     int low=0;
     int high=s.length()-1;
     while(low<high){
        if(Character.isAlphabetic(ch[low])&&Character.isAlphabetic(ch[high])){
            char temp=ch[low];
            ch[low]=ch[high];
            ch[high]=temp;
            low++;
            high--;
        }
        else if(!Character.isAlphabetic(ch[low]))
        low++;
        else if(!Character.isAlphabetic(ch[high]))
        high--;

     }  
       return  String.valueOf(ch);
    }
   
}