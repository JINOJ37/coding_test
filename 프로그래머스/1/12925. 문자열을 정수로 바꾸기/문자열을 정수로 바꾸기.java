class Solution {
    public int solution(String s) {
        boolean checkMinus = false;
        int answer = 0;
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            
            if(c == '-'){
                checkMinus = true;
            } else if(c == '+'){
                continue;
            } else{
                answer = answer*10 + (c-'0');
            }
        }
        
        return (checkMinus) ? -answer : answer;
    }
}