class Solution {
    public static void main(String[] args){
        int[][] mat = {{1,2},{3,4}};
        int r = 1, c = 4;
        System.out.println(matrixReshape(mat,r,c));
    }
  
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length * mat[0].length != r*c){
            return mat;
        }
        int[][] mat1= new int[r][c];
        int m = 0;
        int n = 0;

        for(int i=0;i<mat.length;i++){
            for(int j=0 ; j<mat[0].length;j++){
                if(n==c){
                    m++;
                    n=0;
                }
                mat1[m][n] = mat[i][j];
                n++;
            }
        }
        return mat1;
    }
}
