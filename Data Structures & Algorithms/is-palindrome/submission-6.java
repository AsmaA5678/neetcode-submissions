class Solution {
    public boolean isPalindrome(String s) {
        int right=0;
        int left=s.length()-1;
        while(right<left){
            char r= s.charAt(right);
            char l= s.charAt(left);
            if(!Character.isLetterOrDigit(r)){
                right++;
                continue;
            } 
            if(!Character.isLetterOrDigit(l)){
                left--;
                continue;
            }
            if(Character.toLowerCase(r)!=Character.toLowerCase(l)){
                return false;
            }
            right++;
            left--;
            
        }
        return true;
    }
}