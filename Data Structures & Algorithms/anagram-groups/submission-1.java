class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> count=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String keyMap=convertStrToList(strs[i]);
            List<String> list=count.getOrDefault(keyMap,new ArrayList<String>());
            list.add(strs[i]);
            count.put(keyMap,list);
        }
        return new ArrayList<>(count.values());
    }//1
    public String convertStrToList(String str){
        int[] count=new int[26];
        for(char c:str.toCharArray()){
            count[c-'a']++;
        }
        return Arrays.toString(count);
    }
}

