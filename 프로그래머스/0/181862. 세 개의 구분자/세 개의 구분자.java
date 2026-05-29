import java.util.Arrays;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = Arrays.stream(myStr.split("[abc]+")).filter(i->!i.isEmpty()).toArray(String[]::new);
        if(answer.length == 0)
            return new String[]{"EMPTY"};
        return answer;
    }
}