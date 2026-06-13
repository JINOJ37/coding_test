class Solution {
    public int solution(int[] array, int n) {
        int gap = 100;
        int answer = 0;
        for(int num : array){
            int nowGap = Math.abs(num-n);
            if(nowGap == gap && answer > num){
                answer = num;
            } else if(nowGap < gap){
                gap = nowGap;
                answer = num;
            }
        }
        return answer;
    }
}