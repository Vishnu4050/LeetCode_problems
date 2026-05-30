class Solution {
    public int findMinArrowShots(int[][] t) {
        Arrays.sort(t,(a,b)->Integer.compare(a[1],b[1]));
        int st=t[0][0];
        int end=t[0][1];
        int ans=1;
        for(int i=1;i<t.length;i++){
            int curst=t[i][0];
            if(curst<=end){
                continue;
            }else{
                ans++;
                end=t[i][1];
            }

        }
        return ans;

    }
}