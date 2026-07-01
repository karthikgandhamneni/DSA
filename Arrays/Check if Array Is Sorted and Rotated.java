class Solution {
    static int sort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                continue;
            }else{
                return i+1;
            }
        }
        return -1;
    }
    static void rotate(int[] nums){
        int temp=nums[nums.length-1];
        for(int i = nums.length - 1; i > 0; i--){
            nums[i] = nums[i - 1];
        }
    
        nums[0]=temp;
    }
    public boolean check(int[] nums) {
        int x=sort(nums);

        if(x==-1)
            return true;

        for(int i=x;i<nums.length;i++){
            rotate(nums);
        }

        x=sort(nums);

        if(x==-1){
            return true;
        }
        else{
            return false;
        }

        
    }
}