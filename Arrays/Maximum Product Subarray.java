// 152. Maximum Product Subarray

class Solution {
    public int maxProduct(int[] nums) {




        int pro=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            pro*=nums[i];
            max=Math.max(max,pro);
            if(pro==0) pro=1;
        }
        pro=1;
        for(int i=nums.length-1;i>=0;i--){
            pro*=nums[i];
            max=Math.max(max,pro);
            if(pro==0) pro=1;
        }
        return max;


        
        
       
    }
}