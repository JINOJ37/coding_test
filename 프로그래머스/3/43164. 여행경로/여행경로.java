import java.util.*;

class Solution {
    List<String> answer = new ArrayList<>();
    boolean found = false;
    
    public String[] solution(String[][] tickets) {
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String[] ticket : tickets){
            map.putIfAbsent(ticket[0], new ArrayList<>());
            map.get(ticket[0]).add(ticket[1]);
        }
        
        for(String key : map.keySet()){
            Collections.sort(map.get(key));
        }
        
        int allCount = tickets.length + 1;
        
        dfs(map, "ICN", allCount, 1);
            
        return answer.toArray(new String[0]);
    }
    
    public void dfs(HashMap<String, List<String>> map, String current, int allCount, int depth){
        answer.add(current);
        
        if(depth == allCount) {
            found = true;
            return;
        }
        
        if(!map.containsKey(current)) {
            answer.remove(answer.size() - 1);
            return;
        }
        
        List<String> destinations = map.get(current);
        
        for(int i = 0; i<destinations.size(); i++){
            String next = destinations.get(i);
            destinations.remove(i);
            
            dfs(map, next, allCount, depth + 1);
            
            if(found) return;
            destinations.add(i, next);
        }
        answer.remove(answer.size() - 1);
    }
}