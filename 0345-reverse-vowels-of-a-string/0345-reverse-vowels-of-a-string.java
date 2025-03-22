class Solution {
    public String reverseVowels(String s) {
        char [] ch=s.toCharArray();
       int i=0, j=ch.length-1;
       while(i<j)
       {
           while (i < j && (ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u' &&
                   ch[i] != 'A' && ch[i] != 'E' && ch[i] != 'I' && ch[i] != 'O' && ch[i] != 'U'))

           {
              i++;
          }
           while (i < j && (ch[j] != 'a' && ch[j] != 'e' && ch[j] != 'i' && ch[j] != 'o' && ch[j] != 'u' &&
                   ch[j] != 'A' && ch[j] != 'E' && ch[j] != 'I' && ch[j] != 'O' && ch[j] != 'U'))
          {
              j--;
          }
          char temp=ch[i];
          ch[i]=ch[j];
          ch[j]=temp;
          i++;
          j--;
       }
        return new String(ch);
    }
}