class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int right=numbers.length-1;
        int left=0;
        while(left<right){
            if(numbers[right]+numbers[left]>target){
                right--;
            }else if(numbers[right]+numbers[left]==target){
                return new int[]{left+1,right+1};
            }else{
                left++;
            }
        }
        return new int[]{};
    }
}
