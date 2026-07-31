// 1614. Maximum Nesting Depth of the Parentheses


class Solution {
    public int maxDepth(String s) {
        int d=0,res=0;
        for(char c : s.toCharArray()){
            if(c=='(') d++;
            else if(c==')') d--;

            res=Math.max(d,res);
        }
        return res;
    }
}