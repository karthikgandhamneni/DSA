// 485. Max Consecutive Ones

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,max=0,j;
        for(j=0;j<nums.length;j++){
            if(nums[j]==1){
                count++;
                if(max<count)
                    max=count;
            }
            else
                count=0;
        }

        max=Math.max(count,max);

        return max;
    }
}
