import java.util.HashMap;
class Solution {
    public String solution(String letter) {
        HashMap<String, String> map = new HashMap<>();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<26; i++){
            map.put(morse[i], String.valueOf((char)('a'+i)));
        }
        for(String s : letter.split(" ")){
            sb.append(map.get(s));
        }
        return sb.toString();
    }
}