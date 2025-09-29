class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        for(int i=0;i<n/2;i++){
        int first=i;
        int last=n-1-i;
        char firstchar=s[first];
        char lastchar=s[last];
        s[first]=lastchar;
        s[last]=firstchar;
       
        }

    }
}