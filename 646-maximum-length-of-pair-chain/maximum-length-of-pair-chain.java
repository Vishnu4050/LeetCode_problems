class Solution {
    public int findLongestChain(int[][] pairs) {
        int n=pairs.length;
        int[] t=new int[n];
        Arrays.sort(pairs,(a,b)->a[0]-b[0]);
        Arrays.fill(t,1);
        int  max=1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(pairs[j][1]<pairs[i][0]){
                    if(t[j]+1 > t[i]){
                        t[i]=t[j]+1;
                    }
                }
            }
            max=Math.max(max,t[i]);
        }
        return max;
    }
}