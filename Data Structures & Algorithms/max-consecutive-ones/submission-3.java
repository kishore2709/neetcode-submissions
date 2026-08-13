class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==0)
        return 0;
        int max=0;
        int start=0;
        for(int end=0; end < nums.length; end++){
            if(nums[end]==0){
                start=end+1;
            }
            else
                max = Math.max(max, end - start + 1);
        }
        return max;
    }
}