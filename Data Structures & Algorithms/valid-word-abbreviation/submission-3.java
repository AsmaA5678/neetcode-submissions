class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int wrdIndex=0;
        int abrIndex=0;
        while(wrdIndex<word.length() && abrIndex<abbr.length()){
            if(Character.isLetter(abbr.charAt(abrIndex))){
                if(word.charAt(wrdIndex)!=abbr.charAt(abrIndex)){
                    return false;
                }
                wrdIndex++;
                abrIndex++;
            }else if(Character.isDigit(abbr.charAt(abrIndex))){
                if(abbr.charAt(abrIndex)=='0') return false;
                int c=0;
                while(abrIndex<abbr.length() && Character.isDigit(abbr.charAt(abrIndex))){
                    c=c*10+abbr.charAt(abrIndex)-'0';
                    abrIndex++;
                }
                if (c > word.length() - wrdIndex) return false;
                wrdIndex+=c;
            }
        }
        return wrdIndex == word.length() && abrIndex == abbr.length();      
    }
}