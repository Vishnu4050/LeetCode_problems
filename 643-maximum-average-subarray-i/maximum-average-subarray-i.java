class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double cur_sum=0;
        for(int i =0;i<k;i++){
            cur_sum += nums[i];
        }
        double max_sum=cur_sum;
        for(int j=k;j<nums.length;j++){
           cur_sum = cur_sum -  nums[j-k] + nums[j];
           max_sum = Math.max(max_sum,cur_sum);

        }
        return max_sum/k;
    }
}