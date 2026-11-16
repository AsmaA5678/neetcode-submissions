class Solution {

    public String encode(List<String> strs) {
        StringBuilder buildRes=new StringBuilder();
        final String DELIMITER="#";
        int i=0;
        while(i<strs.size()){
            buildRes.append(strs.get(i).length());
            buildRes.append(DELIMITER);
            buildRes.append(strs.get(i));
            i++;
        }
        return buildRes.toString();
    }
    public List<String> decode(String str) {
        List<String> result=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int count=0;
            while(str.charAt(i)!='#'){
                count=count*10+(str.charAt(i)-'0');
                i++;
            }
            i++;
            StringBuilder current=new StringBuilder();
            for(int j=i;j<i+count;j++){
                current.append(str.charAt(j));
            }
            result.add(current.toString());
            i=i+count;
        }
        return result;
    }
}
