class Solution {
    public void reverse(int[] arr,int s,int end){
        while(s<end){
            int temp=arr[s];
             arr[s]=arr[end];
             arr[end]=temp;
             s++;
             end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int s1=0;
        int e1=n-k-1;
        int s2=n-k;
        int e2=n-1;
        reverse(nums,s1,e1);
        reverse(nums,s2,e2);
        reverse(nums,s1,e2);
    }
}