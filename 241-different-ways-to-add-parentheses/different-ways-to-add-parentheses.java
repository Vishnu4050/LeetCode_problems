class Solution {
    public List<Integer> diffWaysToCompute(String s) {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'){
                List<Integer> left=diffWaysToCompute(s.substring(0,i));
                List<Integer> right=diffWaysToCompute(s.substring(i+1));

                for(int l:left){
                    for(int r:right){
                        if(ch=='-')res.add(l-r);
                        else if(ch=='+')res.add(l+r);
                        else res.add(l*r);

                    }
                }

            }
        }
        if(res.size()==0){
            res.add(Integer.parseInt(s));
        }
        return res;
    }
}