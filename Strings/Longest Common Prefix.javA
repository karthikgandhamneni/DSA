// 14. Longest Common Prefix


class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1=strs[0];
        String str2=strs[strs.length-1];
        int count=0;
        int n=(str1.length()<=str2.length())?str1.length():str2.length();
        for(int i=0;i<n;i++){
            if(str1.charAt(i)==str2.charAt(i)){
                count++;
            }
            else{
                break;
            }
        }

        return str1.substring(0,count);

    }
}