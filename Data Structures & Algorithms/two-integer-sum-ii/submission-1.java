class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int right=0;
        int left=numbers.length-1;
        while(right<left){
            if(numbers[right]+numbers[left]==target){
                return new int[]{right+1,left+1};
            }else if(numbers[right]+numbers[left]>target){
                left--;
            }else{
                right++;
            }
        }
        return new int[]{};
    }
}
