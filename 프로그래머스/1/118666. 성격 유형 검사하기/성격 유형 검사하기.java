import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        HashMap<Character, Integer> scoring = new HashMap<>();
        
        for(int i=0; i<survey.length; i++){
            if(choices[i] == 4) continue;
            char word = (choices[i] > 4) ? survey[i].charAt(1) : survey[i].charAt(0);
            int score = Math.abs(choices[i] - 4);
            
            scoring.put(word, scoring.getOrDefault(word, 0) + score);
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append((scoring.getOrDefault('R', 0).compareTo(scoring.getOrDefault('T', 0)) >= 0) ? 'R' : 'T');
        sb.append((scoring.getOrDefault('C', 0).compareTo(scoring.getOrDefault('F', 0)) >= 0) ? 'C' : 'F');
        sb.append((scoring.getOrDefault('J', 0).compareTo(scoring.getOrDefault('M', 0)) >= 0) ? 'J' : 'M');
        sb.append((scoring.getOrDefault('A', 0).compareTo(scoring.getOrDefault('N', 0)) >= 0) ? 'A' : 'N');
        
        return sb.toString();
    }
}