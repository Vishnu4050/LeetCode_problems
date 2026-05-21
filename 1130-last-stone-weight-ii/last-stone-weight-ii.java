class Solution {
    public int lastStoneWeightII(int[] stones) {
        int n=stones.length;
        int sum=0;
        for(int i:stones){
            sum+=i;
        }
        boolean[][] t=new boolean[n+1][sum+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(j==0){
                    t[i][j]=true;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(stones[i-1]<=j){
                    t[i][j]=t[i-1][j-stones[i-1]]||t[i-1][j];
                }else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        int min=Integer.MAX_VALUE;
        int range=sum/2;
        for(int i=0;i<=range;i++){
            if(t[n][i]==true && i<=range){
                min=Math.min(min,sum-2*i);
            }
        }
        return min;
    }
}