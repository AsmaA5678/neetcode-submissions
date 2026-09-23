class Solution {
    public boolean isPalindrome(String s) {
        int right=0; 
        int left=s.length()-1;
        while(right<left){
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(right))!=Character.toLowerCase(s.charAt(left))){
                return false;
            }
            right++;
            left--;
        }
        return true;
    }
}