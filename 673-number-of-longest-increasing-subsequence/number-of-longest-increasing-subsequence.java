class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        int[] t=new int[n];
        int[] count=new int[n];
        int maxlen=1;
        Arrays.fill(t,1);
        Arrays.fill(count,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(t[j]+1 > t[i]){
                    t[i]=t[j]+1;
                    count[i]=count[j];
                }else if(t[j]+1==t[i]){
                    count[i]+=count[j];
                }
                }
            }
            maxlen=Math.max(maxlen,t[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            if(t[i]==maxlen){
                ans+=count[i];
            }
        }
        return ans;
    }
}