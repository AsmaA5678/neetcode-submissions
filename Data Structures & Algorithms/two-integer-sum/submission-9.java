class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> idx=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x=target-nums[i];
            if(idx.containsKey(x) && i!=idx.get(x)){
                return new int[]{idx.get(x),i};
            }
            idx.put(nums[i],i);
        }
        return new int[]{};
    }
}
