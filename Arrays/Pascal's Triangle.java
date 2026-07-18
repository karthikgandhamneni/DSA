// 118. Pascal's Triangle

class Solution {
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list1 = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> l = new ArrayList<>();
            long val=1;
            for(int j=0;j<=i;j++){
                l.add((int)val);
                val=val*(i-j)/(j+1);
            }
            list1.add(l);
        }
        return list1;
    }
}