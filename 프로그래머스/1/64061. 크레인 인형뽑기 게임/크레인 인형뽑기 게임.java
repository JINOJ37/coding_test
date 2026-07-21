import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> bucket = new Stack<>();
        HashMap<Integer, Stack<Integer>> map = new HashMap<>();
        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[board.length-i-1][j] != 0) map.computeIfAbsent(j+1, k -> new Stack<>()).push(board[board.length-i-1][j]);
            }
        }
        
        int answer = 0;
        for(int m : moves){
            Stack<Integer> col = map.get(m);
            if (col == null || col.empty()) continue;
            
            int doll = map.get(m).pop();
            if(!bucket.empty() && doll == bucket.peek()) {
                bucket.pop();
                answer+=2;
            } else{
                bucket.push(doll);
            }
        }
        
        return answer;
    }
}