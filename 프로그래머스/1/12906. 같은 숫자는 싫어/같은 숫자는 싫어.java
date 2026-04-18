import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i : arr){
            if(stack.isEmpty() || stack.peek() != i)
                stack.push(i);
        }
        
        int lenStack = stack.size();
        int[] answer = new int[lenStack];
        for(int i=lenStack-1; i>=0; i--){
            answer[i] = stack.pop();
        }
        return answer;
        
    }
}