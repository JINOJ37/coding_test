import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> clothMap = new HashMap<>();
        
        for(String[] cloth : clothes){
            clothMap.put(cloth[1], clothMap.getOrDefault(cloth[1], 0) +1);
        }
        
        int[] answer = new int[clothMap.size()];
        int temp = 0;
        
        for(String cloth : clothMap.keySet()){
            answer[temp++] = clothMap.get(cloth);
        }
        
        int result = 1;
        for(int i=0; i<answer.length; i++){
            result *= (answer[i]+1);
        }
        return result - 1;
    }
}