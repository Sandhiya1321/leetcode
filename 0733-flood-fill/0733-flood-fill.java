class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originC=image[sr][sc];
        if(originC==color) return image;

        helpfun(image,sr,sc,originC,color);
        return image;
    }
    void helpfun(int[][] image,int r,int c,int origin,int newC){
        if(r<0||r>=image.length||c<0||c>=image[0].length) return;
        if(image[r][c]!=origin) return;
        image[r][c]=newC;

        helpfun(image,r+1,c,origin,newC);
        helpfun(image,r-1,c,origin,newC);
        helpfun(image,r,c+1,origin,newC);
        helpfun(image,r,c-1,origin,newC);
    }
}