class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] num:image){
            for(int i=0;i<(image[0].length+1)/2;i++){
                int temp=num[i]^1;
                num[i]=num[image[0].length-i-1]^1;
                num[image[0].length-i-1]=temp;
            }
        }
        return image;
    }
}