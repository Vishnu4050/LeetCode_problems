class Solution {
    public boolean isAnagram(String s,String t) {
        if(s.length()!=t.length()) return false;
       HashMap<Character,Integer> map=new HashMap<>();
       for(char ch : s.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                map.put(ch,map.get(ch)+1);
            }
       }
       for(char ch : t.toCharArray()){
        if(map.containsKey(ch)&&map.get(ch)>1){
            map.put(ch,map.get(ch)-1);
        }else if(map.containsKey(ch)&&map.get(ch)<=1){
            map.remove(ch);
        }
       }
      return map.isEmpty();
        
    }
}