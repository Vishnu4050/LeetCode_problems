class Solution {
    public int val(char ch){
        switch(ch){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default : return 0;
        }
    }
    public int romanToInt(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<s.length();i++){
            char k=s.charAt(i);
            if((i+1)<n && val(k) < val(s.charAt(i+1))){
                sum=sum-val(k);
            }else{
                sum=sum+val(k);
            }
        }
        return sum;
    }
}