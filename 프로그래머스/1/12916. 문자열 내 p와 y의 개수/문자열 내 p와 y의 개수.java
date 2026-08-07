class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;

        s = s.toUpperCase();
        for(char c : s.toCharArray()){
            if(c == 'P') count ++;
            if(c == 'Y') count --;
        }
        
        if(count != 0) answer = false;
        return answer;
    }
}