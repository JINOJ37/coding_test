import java.util.ArrayList;
class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> answer = new ArrayList<>();
        int count = 0;
        for(int i=0; i<myString.length(); i++){
            char c = myString.charAt(i);
            if(c == 'x'){
                answer.add(count);
                count = 0;
                continue;
            } else count++;
        }
        answer.add(count);
        return answer.stream().mapToInt(i->i).toArray();
    }
}