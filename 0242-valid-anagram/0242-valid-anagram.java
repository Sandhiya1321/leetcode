class Solution {
    public boolean isAnagram(String s, String t) {
        if(str.length()!=str1.length()){
            return false;
        }
        char[] arr=str.toCharArray();
        char[] arr1=str1.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);
        if(Arrays.equals(arr,arr1)){
            return true;
        }
        return false;
    }
}