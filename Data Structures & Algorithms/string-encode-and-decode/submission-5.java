class Solution {

    public String encode(List<String> strs) {
        StringBuilder buildRes=new StringBuilder();
        final String DELIMITER="#";
        for(String str:strs){
            buildRes.append(str.length());
            buildRes.append(DELIMITER);
            buildRes.append(str);
        }
        return buildRes.toString();
    }
    public List<String> decode(String str) {
        List<String> res=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int n = 0;
            while (str.charAt(i) != '#') {
                n = n * 10 + (str.charAt(i) - '0');
                i++;
            }
            i++;            
            res.add(str.substring(i, i + n));
            i += n;
            n=0;
        }
        return res;
    }
}
