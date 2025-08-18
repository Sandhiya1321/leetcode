class Solution {
    public double largestTriangleArea(int[][] points) {
        double max=0.0;
        for(int i=0;i<points.length;i++){
            int[] p1=points[i];
            for(int j=i+1;j<points.length;j++){
                int[] p2=points[j];
                for(int k=j+1;k<points.length;k++){
                    int[] p3=points[k];
                    double area=triangle(p1,p2,p3);
                    max=Math.max(max,area);
                }
            }
        }
        return max;
    }
    double triangle(int[] a,int[] b,int[] c){
        return 0.5*Math.abs( a[0]* (b[1]-c[1]) + b[0]* (c[1]-a[1]) + c[0]* (a[1]-b[1]));
    }
}