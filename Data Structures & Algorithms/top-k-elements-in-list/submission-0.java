class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> count=new HashMap<>();
        int[] result=new int[k];
        for(int num:nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer, Integer>> entries =new ArrayList<>(count.entrySet());
        //entry.getKey() -- entry.getValue()
        //[1 → 3, 2 → 1, 3 → 2]
        entries.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));
        int i=0;
        for (Map.Entry<Integer, Integer> entry : entries) {
            if(i<k){
                int number = entry.getKey();
                result[i]=number;
                i++;
            }
        }
        return result;

    }
}
