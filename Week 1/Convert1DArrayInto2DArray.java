class Solution {
    public static void main(String[] args){
        int[] original = [1,2,3,4];
        int m = 2, n = 2;
        System.out.println(original,m,n);
    }
  
    public int[][] construct2DArray(int[] original, int m, int n) {
        
        if(original.length!=(m*n)){
            int[][] xx={};
            return xx;
        }
        int[][] mat=new int[m][n];
        int x=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=original[x];
                x++;
            }
        }
        return mat;
    }
}
