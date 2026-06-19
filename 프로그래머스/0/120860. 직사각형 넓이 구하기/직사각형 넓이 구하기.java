class Solution {
    public int solution(int[][] dots) {
        int x = dots[0][0];
        int y = dots[0][1];
        boolean checkX = false;
        boolean checkY = false;
        int answer = 1;
        for(int[] dot : dots){
            if(dot[0] != x && !checkX) {
                answer *= Math.abs(x-dot[0]);
                checkX = true;
            }
            if(dot[1] != y && !checkY) {
                answer *= Math.abs(y-dot[1]);
                checkY = true;
            }
        }
        return answer;
    }
}