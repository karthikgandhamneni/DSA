// 229. Majority Element II


class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l = new ArrayList<>();
        
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int r=map.get(nums[i]);
                
                map.put(nums[i],++r);
            }
        }

        for(int i : map.keySet()){
            if(map.get(i)>(n/3))
                l.add(i);
        }

        return l;
    }
}