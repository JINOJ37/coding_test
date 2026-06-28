import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[][] score) {
        ArrayList<Integer> average_gap = new ArrayList<>();
        int[] answer = new int[score.length];
        int index = 0;
        
        for(int[] personal_score : score){
            int gap = 200 - (personal_score[0] + personal_score[1]);
            
            answer[index++] = gap;
            average_gap.add(gap);
        }
        
        Collections.sort(average_gap);
        
        for(int i=0; i<answer.length; i++){
            answer[i] = average_gap.indexOf(answer[i]) + 1;
        }
        
        return answer;
    }
}