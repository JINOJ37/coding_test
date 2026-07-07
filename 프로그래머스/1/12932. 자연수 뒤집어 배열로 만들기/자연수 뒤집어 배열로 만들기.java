class Solution {
    public int[] solution(long n) {
        String num = String.valueOf(n);
        int[] answer = new int[num.length()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = num.charAt(answer.length-i-1) - '0';
        }
        
        return answer;
    }
}