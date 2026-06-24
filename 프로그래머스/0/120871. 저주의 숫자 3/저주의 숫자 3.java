class Solution {
    public int solution(int n) {
        int answer = 1;
        int num = 1;
        while(num!=n){
            answer++;
            if(String.valueOf(answer).contains("3") || answer%3==0) continue;
            num++;
        }
        return answer;
    }
}