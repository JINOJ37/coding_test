import java.util.HashSet;
class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        boolean[] isHidden = new boolean[message.length()];
        for(int[] s : spoiler_ranges){
            for(int i=s[0] ; i<=s[1]; i++){
                isHidden[i] = true;
            }
        }
        
        HashSet<String> spoiledWord = new HashSet<>();
        HashSet<String> unSpoiledWord = new HashSet<>();
        int currentIndex = 0;
        
        for(String word : message.split(" ")){
            if(word.isEmpty()){
                currentIndex++;
                continue;
            }
            
            boolean isSpoiled = false;
            
            for(int i=0; i<word.length(); i++){
                if(isHidden[currentIndex+i]) {
                    isSpoiled = true;
                    break;
                }
            }
            
            if(isSpoiled) spoiledWord.add(word);
            else unSpoiledWord.add(word);
            
            currentIndex += word.length()+1;
        }
        
        int answer = 0;
        for(String word : spoiledWord){
            if(!unSpoiledWord.contains(word)) answer++;
        }
        
        return answer;
    }
}