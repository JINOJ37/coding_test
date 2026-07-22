import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<Character, Integer> countmap = new HashMap<>();
        
        for(String s : keymap){
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);
                if(countmap.containsKey(c) && countmap.get(c) <= i+1) continue;
                countmap.put(c, i+1);
            }
        }
        
        int[] answer = new int[targets.length];
        for(int i=0; i<targets.length; i++){
            for(char c : targets[i].toCharArray()){
                if(!countmap.containsKey(c)){
                    answer[i] = -1;
                    break;
                }
                answer[i] += countmap.get(c);
            }
        }
        
        return answer;
    }
}