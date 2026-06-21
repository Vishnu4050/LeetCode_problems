class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> max=new PriorityQueue(Collections.reverseOrder());
        for(int i:stones){
            max.offer(i);
        }
        while(!max.isEmpty() && max.size() >= 2){
            int x=max.poll();
            int y=max.poll();
            if(x !=y){
            int res=Math.max(x,y)-Math.min(x,y);
            max.offer(res);
            }

        }
        return max.size()==0 ? 0:max.peek();
    }
}