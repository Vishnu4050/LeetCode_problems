class Solution {
    public void getsubsets(List<List<Integer>>allsubs,List<Integer> ans,int i,int[] nums){
        if(i==nums.length){
            allsubs.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[i]);
        getsubsets(allsubs,ans,i+1,nums);
        ans.remove(ans.size()-1);
        int n=i+1;
        while(n<nums.length && nums[n]==nums[i])n++;
        getsubsets(allsubs,ans,n,nums);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> allsubs=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        getsubsets(allsubs,ans,0,nums);
         return allsubs;

    }
}