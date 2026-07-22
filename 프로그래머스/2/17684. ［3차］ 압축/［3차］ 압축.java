import java.util.*;
class Solution {
    public int[] solution(String msg) {
        HashMap<String, Integer> num_map = new HashMap<>();
        
        for(int i=0; i<26; i++){
            num_map.put(String.valueOf((char)('A'+i)), i+1);
        }
        
        int next_num = 27, pos = 0;
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> answer = new ArrayList<>();
        
        while(pos < msg.length()){
            sb.append(msg.charAt(pos));
            pos++;
            
            if(num_map.containsKey(sb.toString())) continue;
            else{
                num_map.put(sb.toString(), next_num);
                next_num++;
                answer.add(num_map.get(sb.substring(0, sb.length()-1)));
                sb = sb.delete(0, sb.length()-1);
            }
        }
        answer.add(num_map.get(sb.toString()));
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}