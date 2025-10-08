class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int n=mat[0].length;int m=mat.length;
        int srow=0;int scol=0;int erow=m-1;int ecol=n-1;
        List <Integer> ans=new ArrayList<>();
        if(m==0)return ans;
        while(srow<=erow && scol<=ecol){
            for(int i=scol;i<=ecol;i++){
                ans.add(mat[srow][i]);
            }
                srow++;
            for(int j=srow;j<=erow;j++){
                ans.add(mat[j][ecol]);
            }
                ecol--;
            if(srow<=erow){
                for(int j=ecol;j>=scol;j--){
                ans.add(mat[erow][j]);
            }      
                erow--;
            }

            if(scol<=ecol){
                for(int i=erow;i>=srow;i--){
                ans.add(mat[i][scol]);
            }
                scol++;
            }
            }
            return ans;
    }
}