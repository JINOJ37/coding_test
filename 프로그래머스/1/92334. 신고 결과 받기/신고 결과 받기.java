import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, HashSet<String>> reportCount = new HashMap<>();
        HashMap<String, HashSet<String>> idMap = new HashMap<>();
        for(String id : id_list){
            reportCount.put(id, new HashSet<>());
            idMap.put(id, new HashSet<>());
        }
        
        for(String r : report){
            String[] ids = r.split(" ");
            reportCount.get(ids[1]).add(ids[0]);
            idMap.get(ids[0]).add(ids[1]);
        }
        
        List<String> reportId = new ArrayList<>();
        for(Map.Entry<String, HashSet<String>> m : reportCount.entrySet()){
            if(m.getValue().size() >= k) reportId.add(m.getKey());
        }
        
        int[] answer = new int[id_list.length];
        
        for(int i=0; i<id_list.length; i++){
            int count = 0;
            for(String target : idMap.get(id_list[i])){
                if(reportId.contains(target)) count++;
            }
            answer[i] = count;
        }
        return answer;
    }
}