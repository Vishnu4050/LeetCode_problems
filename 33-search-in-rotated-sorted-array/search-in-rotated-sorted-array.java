class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right =nums.length-1;
        int index=bin(nums,target,left,right);
        return index;
    }
    public static int bin(int[] nums,int target,int left,int right){
        int mid=(left+(right-left)/2);
        if(left > right) return -1;
        if(nums[mid]==target) return mid;
        if(nums[mid]>=nums[left]){
            if(nums[left]<=target && target<=nums[mid]) return bin(nums,target,left,mid-1);
            else
            return bin(nums,target,mid+1,right);
        }
        else{
            if(nums[mid]<=target && target<=nums[right])return bin(nums,target,mid+1,right);
            else
            return bin(nums,target,left,mid-1);
        }
        
        
    }
}