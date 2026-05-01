class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] ps = new int[nums.length];
        ps[0] = nums[0];
        for(int i = 1;i<nums.length;i++){
            ps[i]=ps[i-1]+nums[i];
        }
        int count =0 ;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int j =0;j<ps.length;j++){
            if(ps[j]==k)count++;
            int val = ps[j]-k;
            if(map.containsKey(val)){
                count += map.get(val);
            }
            if(map.containsKey(ps[j])){
                map.put(ps[j],map.get(ps[j])+1);
            }else{
                map.put(ps[j],1);
            }
        }
        return count;
    }
}