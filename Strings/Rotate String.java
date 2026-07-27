// 796. Rotate String

class Solution {
    public boolean rotateString(String s, String goal) {
        int count=0,i;
        while(true){
            if(s.equals(goal)){
                return true;
            }
            if(count==s.length()-1)
                return false;
            char temp = s.charAt(0);
            char[] str = s.toCharArray();
            for(i=0;i<s.length()-1;i++){
                str[i]=str[i+1];
            }
            str[i]=temp;
            count++;
            s = new String(str);
        }
    }
}