class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int x=i; x<=j; x++){
            String num = String.valueOf(x);
            for(char c : num.toCharArray()){
                if(k == c-'0') answer++;
            }
        }
        return answer;
    }
}