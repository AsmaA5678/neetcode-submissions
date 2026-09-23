class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> result = new HashSet<>();
        for(int num:nums){
            if(!result.add(num)){
                return true;
            }
        }
        return false;
    }
}