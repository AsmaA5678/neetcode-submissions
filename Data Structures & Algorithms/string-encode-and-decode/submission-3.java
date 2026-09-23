class Solution {

    public String encode(List<String> strs) {
        if(strs.size()==0) return "Empty";
        return String.join("mst",strs);
    }

    public List<String> decode(String str) {
        if (str.equals("Empty")) return new ArrayList<String>();
        return List.of(str.split("mst",-1));
    }
}
