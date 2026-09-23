class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> seen =new HashMap<>();
        for(int num:nums){
            seen.put(num,seen.getOrDefault(num,0)+1);
        }
        List<Integer> keys = new ArrayList<>(seen.keySet());
        keys.sort((a,b)->seen.get(b)-seen.get(a));
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=keys.get(i);
        }
        return result;

    }
}