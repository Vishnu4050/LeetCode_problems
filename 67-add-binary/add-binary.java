class Solution {
    public String addBinary(String a, String b) {
        int as=a.length()-1;
        int bs=b.length()-1;
        int c=0,base=2;
        StringBuilder res=new StringBuilder();
        while(as>=0 || bs>=0){
            int t1=0,t2=0,sum;
            if(as>=0){
                t1=a.charAt(as--)-'0';
            }
            if(bs>=0){
                t2=b.charAt(bs--)-'0';
            }
            sum=t1+t2+c;
            if(sum>=base){
                c=1;
                sum=sum-base;
            }
            else{
                c=0;
            }
            res.append(sum);
        }
        if(c==1){
            res.append(c);
        }
        return res.reverse().toString();
    }
}