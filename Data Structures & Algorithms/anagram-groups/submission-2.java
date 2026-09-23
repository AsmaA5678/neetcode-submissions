class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>,ArrayList<String>> result=new HashMap<>();
        for(String str:strs){
            int[] count=new int[26];
            for(Character c:str.toCharArray()){
                count[c-'a']++;
            }
            List<Integer> key = new ArrayList<>();
            for (int n : count) {
                key.add(n);
            }
            ArrayList<String> list= result.getOrDefault(key,new ArrayList<>());
            list.add(str);
            result.put(key,list);
        }
        return new ArrayList<>(result.values());
    }
}

