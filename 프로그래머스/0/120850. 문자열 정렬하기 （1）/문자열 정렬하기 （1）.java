import java.util.ArrayList;
class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(char c : my_string.toCharArray()){
            if(48<=(int)c && (int)c<=57) answer.add((int)c-48);
        }
        
        return answer.stream().sorted().mapToInt(i->i).toArray();
    }
}