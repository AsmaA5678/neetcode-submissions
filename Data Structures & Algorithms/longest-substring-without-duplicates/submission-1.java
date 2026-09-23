class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        HashSet<Character> seen= new HashSet<>();
        int max=1;
        int current=0;
        int left=0;
        for(char c:s.toCharArray()){
            while(seen.contains(c)){
                seen.remove(s.charAt(left));
                left++;
                current--;
            }
            seen.add(c);
            current++;
            max=Math.max(current,max);
            
            
        }
        return max;
    }
}
