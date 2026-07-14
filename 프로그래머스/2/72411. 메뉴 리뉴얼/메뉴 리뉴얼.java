import java.util.*;
class Solution {
    Map<String, Integer> map = new HashMap<>();
    
    public String[] solution(String[] orders, int[] course) {
        for(String o : orders){
            char[] ch = o.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            
            for(int c : course){
                combi(s, 0, c, new StringBuilder());
            }
        }
        
        List<String> result = new ArrayList<>();
        
        for(int c : course){
            int max = 0;
            
            for(String key : map.keySet()){
                if(key.length() == c) max = Math.max(max, map.get(key));
            }
            
            for(String key : map.keySet()){
                if(key.length() == c && map.get(key) == max && max >= 2){
                    result.add(key);
                }
            }
        }
        
        Collections.sort(result);
        return result.toArray(new String[0]);
    }
    
    void combi(String order, int start, int c, StringBuilder sb){
        if(sb.length() == c){
            map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
            return;
        }
        
        for(int i=start; i<order.length(); i++){
            sb.append(order.charAt(i));
            combi(order, i+1, c, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}