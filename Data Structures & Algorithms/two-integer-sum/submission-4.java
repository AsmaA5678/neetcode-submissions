class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> seen=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            seen.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(seen.containsKey(target-nums[i]) &&  i!= seen.get(target-nums[i])){
                return new int[]{i,seen.get(target-nums[i])};
            }
        }
        return new int[]{};
    }
}
