// 451. Sort Characters By Frequency

class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }
            else{
                int j = map.get(c);
                map.put(c,++j);
            }
        }
        List<Character> l = new ArrayList<>();
        for(char i : map.keySet()){
            l.add(i);
        }
        Collections.sort(l,(a,b)-> map.get(b)-map.get(a));
        String res = "";
        for(char ch : l){
            int f = map.get(ch);
            for(int i=0;i<f;i++){
                res+=ch;
            }
        }
        return res;
    }
}