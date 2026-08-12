class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==0)
        return 0;
        int count = (nums[0] == 1 ? 1 : 0), maxCount =0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==1){
            count++;
            }
            else{
                maxCount= Math.max(maxCount,count);
                count =0;
            }
        }
        return Math.max(maxCount,count);
    }
}