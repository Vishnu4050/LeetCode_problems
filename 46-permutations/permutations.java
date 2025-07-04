class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>  result = new ArrayList<>();
        backTrack(result,new ArrayList<>(),nums);
        return result;
        
    }

    public static void backTrack(List<List<Integer>> result,List<Integer> tempSet,int[] nums){
        if(nums.length==tempSet.size()){
            result.add(new ArrayList<>(tempSet));
            return;
        }
        for(int num:nums){
            if(tempSet.contains(num)) continue;
            tempSet.add(num);
            backTrack(result,tempSet,nums);
            tempSet.remove(tempSet.size()-1);
        }
    }
}
