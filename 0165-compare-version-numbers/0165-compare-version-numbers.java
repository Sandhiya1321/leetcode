class Solution {
    public int compareVersion(String version1, String version2) {
        String[] a=version1.split("\\.");
        String[] b=version2.split("\\.");
        int maxlength=Math.max(a.length,b.length);
        for(int i=0;i<maxlength;i++){
            int rev1=i<a.length?Integer.parseInt(a[i]):0;
            int rev2=i<b.length?Integer.parseInt(b[i]):0;
            if(rev1<rev2){
                return -1;
            }
            if(rev1>rev2){
                return 1;
            }
        }
          return 0;
    }
  
}