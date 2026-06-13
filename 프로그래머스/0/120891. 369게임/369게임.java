class Solution {
    public int solution(int order) {
        int answer = 0;
        while(order > 1){
            int nextNum = order%10;
            if(nextNum == 3 || nextNum == 6 || nextNum == 9) answer++;
            order/=10;
        }
        return answer;
    }
}