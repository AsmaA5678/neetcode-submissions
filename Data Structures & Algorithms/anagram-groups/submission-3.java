class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> result=new HashMap<>();
        for(String str:strs){
            int[] count=new int[26];
            for(Character c:str.toCharArray()){
                count[c-'a']++;
            }
            String key=Arrays.toString(count);
            result.computeIfAbsent(key,k-> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(result.values());
    }
}

