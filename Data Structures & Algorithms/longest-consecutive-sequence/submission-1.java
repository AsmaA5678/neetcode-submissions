class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> seen=new HashSet<>();
        for(int num:nums){
            seen.add(num);
        }
        List<Integer> list = new ArrayList<>(seen);
        Collections.sort(list);
        int count=1;
        int max=1;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i+1)==list.get(i)+1){
                count++;
            }else{
                count=1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
