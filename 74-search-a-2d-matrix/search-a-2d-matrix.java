class Solution {
    public boolean searchrow(int[][] mat, int target,int mrow){
        int n=mat[0].length;
        int s=0;int e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target == mat[mrow][mid]){
                return true;
            }else if(target > mat[mrow][mid]){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] mat, int target) {
        int m=mat.length;int n=mat[0].length;
        int srow=0;int erow=m-1;
        while(srow<=erow){
            int mrow = srow+(erow-srow)/2;
            if(target >=mat[mrow][0] && target<=mat[mrow][n-1]){
                return searchrow(mat,target,mrow);
            }else if(target > mat[mrow][n-1]){
                srow=mrow+1;
            }else{
                erow=mrow-1;
            }
        }
        return false;
    }
}