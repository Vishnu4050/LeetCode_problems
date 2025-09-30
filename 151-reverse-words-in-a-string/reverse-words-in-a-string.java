class Solution {
    public String reverseWords(String s) {
        String res = "";

        for(int i=0;i<s.length();i++){
           StringBuilder sb=new StringBuilder();
           while(i<s.length() && s.charAt(i)!=' '){
            sb.append(s.charAt(i));
            i++;
           }
           if(sb.length()!=0){
            res=" "+sb+res;
           }
        }
        return res.trim();  
    }
}