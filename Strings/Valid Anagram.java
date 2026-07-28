class Solution {
    public boolean isAnagram(String s, String t) {
        s=s.toUpperCase();
        t=t.toUpperCase();
        int[] fre = new int[26];
        
        for(int i=0;i<s.length();i++){
            fre[s.charAt(i)-'A']++;
        }
        for(int i=0;i<t.length();i++){
            fre[t.charAt(i)-'A']--;
        }

        for(int i : fre){
            if(i!=0)
                return false;
        }
        return true;
    }
}