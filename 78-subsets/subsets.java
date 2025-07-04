class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        backTrack(res,new ArrayList<>(),nums,0);
        return res;
    }
    public static void backTrack(List<List<Integer>> res,List<Integer> tempSet,int[] nums,int start){
        res.add(new ArrayList<>(tempSet));

        for(int i=start;i<nums.length;i++){
            tempSet.add(nums[i]);
            backTrack(res,tempSet,nums,i+1);
            tempSet.remove(tempSet.size()-1);
        }
    }
}