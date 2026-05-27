class Solution {
    public HashMap<String,Boolean> map=new HashMap<>();
    public boolean isScramble(String a, String b) {
        if(a.length()!=b.length())return false;
		if(a.equals(b))return true;
		if(a.length()<=1)return false;
		String s=a+" "+b;
		if(map.containsKey(s))return map.get(s);
		int n =a.length();
		boolean flag=false;
		for(int i=1;i<n;i++) {
			if(isScramble(a.substring(0, i),b.substring(n-i, n))&&isScramble(a.substring(i, n),b.substring(0, n-i))) {
				flag=true;
				break;
			}
			if(isScramble(a.substring(0, i),b.substring(0, i))&&isScramble(a.substring(i, n),b.substring(i, n))) {
				flag=true;
				break;
			}
			
		}
		map.put(s, flag);
		return flag;
	}
	
    
}