class Solution {
    public String reverseWords(String s) {
        String[] word = s.trim().split(" +");
        String res = "";

        for(int i=word.length-1;i>=0;i--){
            res = res + word[i] + " ";
        }
        return res.trim();  
    }
}