class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> sCount=count(s);
        HashMap<Character,Integer> tCount=count(t);
        if(sCount.size()!=tCount.size()) return false;
        for(Character c:sCount.keySet()){
            if(!sCount.get(c).equals(tCount.get(c))){
                return false;
            }
        }
        return true;
    }
    public HashMap<Character,Integer> count(String str){
        HashMap<Character,Integer> count= new HashMap<>();
        for(char c:str.toCharArray()){
            count.put(c,count.getOrDefault(c,0) +1);
        }
        return count;
    }
}
