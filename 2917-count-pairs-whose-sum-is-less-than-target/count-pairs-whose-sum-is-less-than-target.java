class Solution {
    public int countPairs(List<Integer> nums, int target) {
    int res=0;
    nums.sort((a,b)->(a-b));
    int s=0;
    int e=nums.size()-1;
    while(s<=e){
        if(nums.get(s) + nums.get(e) < target){
            res += e-s;
            s++;
        }else{
            e--;
        }
    }
    return res;
    }
}