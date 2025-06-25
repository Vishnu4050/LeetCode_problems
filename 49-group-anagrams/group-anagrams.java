class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0) return new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
       
        for(String str:strs){
            String freqStr = countFreq(str);
            if(map.containsKey(freqStr)){
                map.get(freqStr).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(freqStr,list);

            }
        }
        return new ArrayList<>(map.values());  
    }
    private static String countFreq(String str) {
			if(str.length()==0) return "";
			int[] freq = new int[26];
			for(char ch :str.toCharArray()) {
				freq[ch-'a']++;
			}
			StringBuilder sb = new StringBuilder("");
			char ch = 'a';
			for(int i: freq) {
				sb.append(ch);
				sb.append(i);
				ch++;
			}
			return sb.toString();
		}
}