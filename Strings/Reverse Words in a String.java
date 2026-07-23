class Solution {
    public String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        s=s.trim();
        for(int i=0;i<s.length();i++){
            

            if(s.charAt(i)!=' '){
                word.append(s.charAt(i));
            }

            else if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                words.add(word.toString());
                word.setLength(0);
            }
        }
        words.add(word.toString());
        Collections.reverse(words);
        StringBuilder result = new StringBuilder("");
        for(String str : words){
            result.append(str);
            result.append(" ");
        }
        result=new StringBuilder(result.toString().trim());
        return result.toString();
    }
}