import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        List<Integer> list = Arrays.stream(emergency).boxed().collect(Collectors.toList());
        int order = 1;
        Arrays.sort(emergency);
        for(int i=emergency.length-1; i>=0; i--){
            answer[list.indexOf(emergency[i])] = order++;
        }
        return answer;
    }
}