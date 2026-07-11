import java.util.Map;
import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> clothesMap = new HashMap<>();
        
        for(String[] cloth : clothes){
            clothesMap.put(cloth[1], clothesMap.getOrDefault(cloth[1], 0)+1);
        }
        
        int answer = 1;
        for(Map.Entry<String, Integer> e : clothesMap.entrySet()){
            answer *= (e.getValue()+1);
        }
        
        return answer-1;
    }
}