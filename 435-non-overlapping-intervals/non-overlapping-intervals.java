class Solution {
    public int eraseOverlapIntervals(int[][] t) {
    List<int[]> list=new ArrayList<>();
	Arrays.sort(t,(a,b)->a[1]-b[1]);
	int[] cur=t[0];
	for(int i=1;i<t.length;i++) {
		if(t[i][0]>=cur[1]) {
			list.add(cur);
			cur=t[i];
		}
	}
	list.add(cur);
    return t.length-list.size();
    }
}