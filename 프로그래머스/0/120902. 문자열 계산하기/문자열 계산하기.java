import java.util.Stack;
class Solution {
    public int solution(String my_string) {
        Stack<String> stack = new Stack<>();
        StringBuilder stack_push = new StringBuilder();
        my_string += " ";
        for(char c : my_string.toCharArray()){
            if(c == ' ') {
                stack.push(stack_push.toString());
                stack_push.delete(0, stack_push.length());
            } else{
                stack_push.append(c);
            }
            if(stack.size() == 3){
                int b = Integer.parseInt(stack.pop());
                String exp = stack.pop();
                int a = Integer.parseInt(stack.pop());
                if(exp.equals("+")) stack.push(String.valueOf(a+b));
                else stack.push(String.valueOf(a-b));
            }
        }
        return Integer.parseInt(stack.pop());
    }
}