class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int k=strs.length;
        int[][] t=new int[m+1][n+1];
        for(String s : strs){
            int zeros=0;
            int ones=0;
            for( char c : s.toCharArray()){
                if(c=='0')zeros++;
                else ones++;
            }
              for(int i=m;i>=zeros;i--){
            for(int j=n;j>=ones;j--){
                t[i][j]=Math.max(t[i][j],1+t[i-zeros][j-ones]);
            }
        }
        }
      
        return t[m][n];
    }
}