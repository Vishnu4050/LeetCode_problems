class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         Map<Integer,Integer> hp= new HashMap<>();
         Stack<Integer> stk= new Stack<>();

        for(int i=nums2.length-1;i>=0;i--){
            int curr =nums2[i];
            while(!stk.isEmpty() && curr>=stk.peek()){
                stk.pop();
            }
            int ng=stk.isEmpty() ? -1 : stk.peek();
            hp.put(curr,ng);
            stk.push(curr);
        }
         int[] res=new int[nums1.length];
         for(int i=0;i<nums1.length;i++){
                res[i]=hp.getOrDefault(nums1[i],-1);
         }
         return res;
   
   
    }

}
