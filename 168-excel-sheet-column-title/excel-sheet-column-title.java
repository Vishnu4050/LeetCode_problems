class Solution {
    public String convertToTitle(int c) {
        StringBuilder sb=new StringBuilder();
        while(c>0){
            int r=(c-1)%26;
            sb.append((char)(r+'A'));
            c=(c-1)/26;
        }
        return sb.reverse().toString();
    }
}