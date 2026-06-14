class Solution {
    public String solution(String my_string, int num1, int num2) {
        char first_word = my_string.charAt(num1);
        StringBuilder answer = new StringBuilder();
        
        for(int i=0; i<my_string.length(); i++){
            if(i == num1) answer.append(my_string.charAt(num2));
            else if(i == num2) answer.append(first_word);
            else answer.append(my_string.charAt(i));
        }
        return answer.toString();
    }
}