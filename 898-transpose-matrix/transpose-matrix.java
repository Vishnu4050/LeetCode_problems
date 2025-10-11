class Solution {
    public int[][] transpose(int[][] mat) {
        int rows=mat.length;
        int columns=mat[0].length;
        int[][] res=new int[columns][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                res[j][i]=mat[i][j];
            }
        }
        return res;
    }
}