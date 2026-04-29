import java.util.*;

class Solution {
    int answer = 10;
    
    public int solution(String begin, String target, String[] words) {
        if(!Arrays.asList(words).contains(target)){
            return 0;
        }
        
        HashMap<String, Boolean> visited = new HashMap<>();
        for(String word : words){
            visited.put(word, false);
        }
        visited.put(begin, false);
        
        dfs(visited, words, begin, target, 0);
        
        return answer;
    }
    
    public void dfs(HashMap<String, Boolean> visited, String[] words, String now, String target, int depth){
        if(now.equals(target)){
            answer = Math.min(answer,depth);
            return;
        }
        
        visited.put(now, true);
        
        for(String word : words){
            if(visited.get(word)) continue;
                
            int count = 0;
            for(int i=0; i<word.length(); i++){
                if(word.charAt(i) != now.charAt(i))
                    count++;
            }
            System.out.print(count);
            
            if(visited.get(word) == false && count == 1){
                dfs(visited, words, word, target, depth+1);
            }
        }
        
        visited.put(now, false);
    }
}