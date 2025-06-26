class Solution {
    public int firstUniqChar(String s) {
        char[] ch=s.toCharArray();
        int[] freq=new int[26];

        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(int i=0;i<ch.length;i++){
            if(freq[ch[i]-'a']==1) return i;
        }
    return -1;
    }

}