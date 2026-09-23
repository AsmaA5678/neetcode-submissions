class Solution {
    public int[] productExceptSelf(int[] nums) {
        int x = 1;          // product of the NON-ZERO numbers
        int zeros = 0;      // how many zeros
        for (int num : nums) {
            if (num == 0) zeros++;
            else x = x * num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (zeros > 1) {
                nums[i] = 0;
            } else if (zeros == 1) {
                nums[i] = (nums[i] == 0) ? x : 0;
            } else {
                nums[i] = x / nums[i];
            }
        }
        return nums;   // the return was missing
    }
}