class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i:nums){
            q.offer(i);
        }
        for(int i=0;i<n-k;i++){
            q.poll();
        }
        return q.peek();
    }
}