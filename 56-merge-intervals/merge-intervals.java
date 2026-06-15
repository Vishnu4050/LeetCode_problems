class Solution {
    public int[][] merge(int[][] t) {
        Arrays.sort(t,(a,b)->a[0]-b[0]);
        int[] intr=t[0];
        
        List<int[]> list=new ArrayList<>();
        for(int i=1;i<t.length;i++){
           int[] cur_int=t[i]; 
            if(cur_int[0]<=intr[1]){
                intr[1]=Math.max(intr[1],cur_int[1]);
            }else{
                list.add(intr);
               intr=cur_int;
            }
        }
        list.add(intr);
        return list.toArray(new int[list.size()][]);
    }
}