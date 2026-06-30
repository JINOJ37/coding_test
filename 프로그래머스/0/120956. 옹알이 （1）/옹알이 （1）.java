class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(String word : babbling){
            word = word.replaceFirst("aya", " ");
            word = word.replaceFirst("ye", " ");
            word = word.replaceFirst("woo", " ");
            word = word.replaceFirst("ma", " ");
            
            if(word.trim().length() == 0) answer++;
        }
        
        return answer;
    }
}