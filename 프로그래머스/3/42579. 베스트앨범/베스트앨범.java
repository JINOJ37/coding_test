import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        List<String> order = new ArrayList<>(map.keySet());
        order.sort((a,b) -> Integer.compare(map.get(b), map.get(a)));
        
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<order.size(); i++){
            String genre = order.get(i);
            
            int firstPlay= -1;
            int secondPlay= -1;
            
            int firstIndex = -1;
            int secondIndex = -1;
            
            for(int j=0; j<genres.length; j++){
                if(genres[j].equals(genre)){
                    if(plays[j] > firstPlay) {
                        secondPlay = firstPlay;
                        secondIndex = firstIndex;
                        firstPlay = plays[j];
                        firstIndex = j;
                    } else if(plays[j] > secondPlay) {
                        secondPlay = plays[j];
                        secondIndex = j;
                    }
                }
            }
            
            answer.add(firstIndex);
            if(secondIndex != -1) answer.add(secondIndex);
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}