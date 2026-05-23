class Solution {
    public int[][] merge(int[][] t) {
        Arrays.sort(t,(a,b)->a[0]-b[0]);
        int start=t[0][0];
        int end=t[0][1];
        List<int[]> list=new ArrayList<>();
        for(int i=1;i<t.length;i++){
            int curst=t[i][0];
            int curend=t[i][1];
            if(curst<=end){
                end=Math.max(end,curend);
            }else{
                list.add(new int[]{start,end});
                start=curst;
                end=curend;
            }
        }
        list.add(new int[]{start,end});
        return list.toArray(new int[list.size()][]);
    }
}