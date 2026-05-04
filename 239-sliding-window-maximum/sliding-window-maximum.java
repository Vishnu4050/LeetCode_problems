class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i =0;i<k;i++){
            while(dq.size() > 0 && nums[dq.peekLast()] <= nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        for(int i =k ; i < nums.length;i++){
            res.add(nums[dq.peekFirst()]);
            while(dq.size()>0 && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }
            while(dq.size() > 0 && nums[dq.peekLast()] <= nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        res.add(nums[dq.peekFirst()]);
        int[] arr = res.stream().mapToInt(Integer::intValue).toArray();
        return arr ;
    }
}