class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(my_str.length()+n-1)/n];
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(char c : my_str.toCharArray()){
            sb.append(c);
            if(sb.length() == n) {
                answer[index++] = sb.toString();
                sb.setLength(0);
            }
        }
        if(sb.length() != 0) answer[index++] = sb.toString();
        return answer;
    }
}