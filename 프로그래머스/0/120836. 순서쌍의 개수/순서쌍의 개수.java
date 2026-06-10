class Solution {
    public int solution(int n) {
        int answer = 0;
        System.out.println((int)Math.sqrt(n));
        for(int i=1; i<=(int)Math.sqrt(n); i++){
            if(n%i==0){
                if(n/i == i) answer++;
                else answer+=2;
            }
        }
        return answer;
    }
}