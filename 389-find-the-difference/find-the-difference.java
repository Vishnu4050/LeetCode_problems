class Solution {
    public char findTheDifference(String s, String t) {
        int sums=0;
        for(char ch:s.toCharArray()){
            sums += ch;
        }
        int sumt=0;
        for(char ch:t.toCharArray()){
           sumt+=ch;
        }
        return (char)(sumt-sums);
    }
}