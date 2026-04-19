import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        
        int[] scores = new int[3];
        
        for(int i = 0; i<answers.length; i++){
            if(answers[i] == a[(i%a.length)]) scores[0]++;
            if(answers[i] == b[(i%b.length)]) scores[1]++;
            if(answers[i] == c[(i%c.length)]) scores[2]++;
        }
        
        int maxValue = Math.max(scores[0], Math.max(scores[1], scores[2]));
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0; i<3; i++){
            if(scores[i] == maxValue)
                result.add(i);
        }
        
        int[] answer = new int[result.size()];
        for(int i = 0; i<result.size(); i++){
            answer[i] = result.get(i)+1;
        }
        
        return answer;
    }
}