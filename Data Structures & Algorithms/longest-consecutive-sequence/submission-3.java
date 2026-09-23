class Solution {
    public int longestConsecutive(int[] nums) { 
        Set<Integer> seen=new HashSet<>();
        for(int num:nums){
            seen.add(num);
        }
        int max=0;
        for(int num:nums){
            int x=1;
            int y=num;
            if(!seen.contains(num-1)){
                while(seen.contains(y+1)){
                x++;
                y++;
                }
                max=Math.max(max,x);
            }
            
        }
        return max;
    }
}
