import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String x = Integer.toString(a);
        String y = Integer.toString(b);
    
        int ab = Integer.parseInt(x+y);
        int ba = Integer.parseInt(y+x);
        
        answer = Math.max(ab, ba);
        return answer;
    }
}