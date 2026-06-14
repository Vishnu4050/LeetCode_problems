class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double maxavg=(double)sum/k;
        for(int i=k;i<nums.length;i++){
            sum=sum-nums[i-k]+nums[i];
            double curavg=(double)sum/k;
            maxavg=Math.max(maxavg,curavg);
        }
        return nums.length<=1 ? (double)nums[0]:maxavg;
    }
}