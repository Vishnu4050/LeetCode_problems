class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int child=0;
        int cookie=0;
        while(cookie<s.length && child<g.length){
            if(s[cookie]>=g[child]){
                child++;
            }
            cookie++;
        }
      
        return child;
    }
}