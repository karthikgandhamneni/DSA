// 152. Maximum Product Subarray

class Solution {
    public int maxProduct(int[] nums) {


        // int ans=nums[0],max=nums[0],min=nums[0];

        // for(int i=1;i<nums.length;i++){

        //     int curr = nums[i];

        //     if(curr<0){
        //         int temp=max;
        //         max=min;
        //         min=temp;
        //     }

        //     max=Math.max(curr,max*curr);
        //     min=Math.min(curr,min*curr);
        //     ans=Math.max(max,ans);
        // }
        // return ans;


        

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