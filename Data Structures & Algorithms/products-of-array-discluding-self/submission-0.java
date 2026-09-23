class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] result = new int[n];
        result[n-1] = 1;
        for(int i = n-1 ; i>0 ; i--){
            result[i - 1] = nums[i]*result[i];
        }
        int currProd = 1;
        for(int i = 0 ; i < n ; i++){
            result[i] = currProd*result[i];
            currProd *= nums[i];
        }
        return result;  
    }
}  
