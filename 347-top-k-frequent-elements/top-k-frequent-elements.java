class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer>[] bucket =new List[nums.length+1];
        for(int i:map.keySet()){
            int freq=map.get(i);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(i);
        }
        int[] res=new int[k];
        int counter=0;
        for(int pos=bucket.length-1;pos >=0 && counter < k;pos--){
            if(bucket[pos]!=null){
                for(int i:bucket[pos]){
                    res[counter++]=i;
                }
            }
        }
        return res;


       
    }
}