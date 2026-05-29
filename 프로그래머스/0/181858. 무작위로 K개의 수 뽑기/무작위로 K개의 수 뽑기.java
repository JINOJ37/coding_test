import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int n : arr){
            if(answer.size() == k) break;
            if(answer.contains(n)) continue;
            answer.add(n);
        }
        
        if(answer.size() < k){
            for(int i=answer.size(); i<k; i++)
                answer.add(-1);
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}