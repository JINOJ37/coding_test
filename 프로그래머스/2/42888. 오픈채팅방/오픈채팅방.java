import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        Map<String, String> uid_name = new HashMap<>();
        List<String[]> message = new ArrayList<>();
            
        for(String r : record){
            String[] s = r.split(" ");
            
            if(!s[0].equals("Change")){
                message.add(new String[]{s[1], s[0]});
            } 
            if(!s[0].equals("Leave")){
                uid_name.put(s[1], s[2]);
            }
        }
        
        String[] answer = new String[message.size()];
        
        for(int i=0; i<message.size(); i++){
            String s = (message.get(i)[1].equals("Enter")) ? "님이 들어왔습니다." : "님이 나갔습니다.";
            answer[i] = uid_name.get(message.get(i)[0]) + s; 
        }
        
        return answer;
    }
}