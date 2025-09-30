class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length()-needle.length();
        for(int i=0;i<=n;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                String sub =haystack.substring(i,needle.length()+i);
                if(sub.equals(needle)) return i;
            }
        }
        return -1;
    }
}