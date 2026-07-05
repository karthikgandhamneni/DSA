// 169. Majority Element

class Solution {

    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int count=map.get(nums[i]);
                count++;
                map.put(nums[i],count);
            }
        }

        for(int i  : map.keySet()){
            if(map.get(i)>nums.length/2)
                return i;
        }
        return -1;
    }
}