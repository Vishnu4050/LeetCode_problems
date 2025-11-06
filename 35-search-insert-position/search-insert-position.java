class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int i=0;
        while(i<n){
            if(nums[i]==target){
                return i;
            }
            else if(nums[i]<target){
                i++;
            }
            else if(nums[i]>target){
                return i;
            }
        }
        return nums.length;
    }
        
}