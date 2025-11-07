class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
          if (words.length != pattern.length()) {
            return false;
        }
        HashMap<Character,String> map=new HashMap<>();
        Set<String> set=new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            char a=pattern.charAt(i);
            String b=words[i];
            if(map.containsKey(a)){
                if(!map.get(a).equals(b)){
                    return false;
                }
            }
            else{
                    if(set.contains(b)){
                        return false;
                    }
                    map.put(a,b);
                    set.add(b);
                }
        }
        return true;
    }
}