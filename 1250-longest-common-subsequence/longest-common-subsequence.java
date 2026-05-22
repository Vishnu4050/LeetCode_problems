class Solution {
    public int longestCommonSubsequence(String a, String b) {
        int n=a.length();
        int m=b.length();
        int[][] t=new int[n+1][m+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    t[i][j]=t[i-1][j-1]+1;
                }else{
                    t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
                }
            }
        }
        return t[n][m];
    }
}