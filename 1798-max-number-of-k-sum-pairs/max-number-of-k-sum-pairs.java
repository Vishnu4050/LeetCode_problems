class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i:nums){
            int need=k-i;
            if(map.getOrDefault(need,0)>0){
                count++;
                map.put(need,map.get(need)-1);
            }else{
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        return count;

    }
}