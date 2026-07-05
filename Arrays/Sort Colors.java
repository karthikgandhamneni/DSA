// 75. Sort Colors

class Solution {
    static void swap(int[] nums,int a,int b){
        if(a!=b){

            nums[a]=nums[a]^nums[b];
            nums[b]=nums[a]^nums[b];
            nums[a]=nums[a]^nums[b];
        }
    }
    public void sortColors(int[] nums) {
        int i,j=0;
        for( i=0;i<nums.length;i++){
            if(nums[i]==0){
                swap(nums,i,j);
                j++;
            }
        }

        

        int k=j;
        for( i=j;i<nums.length;i++){
            if(nums[i]==1){
                swap(nums,i,k);
                k++;
            }
        }
    }
}