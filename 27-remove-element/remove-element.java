class Solution {
    public int removeElement(int[] nums, int val) {
        int j=nums.length-1;
        int i=0;
        int count=0;
        while(i<=j){
            if(nums[i]==val){
                nums[i]=nums[j];
                nums[j]=0;
                j--;
                count++;
            }
            else{
                i++;
            }
        }
        int k = nums.length-count;
        return k;
        
    }
}