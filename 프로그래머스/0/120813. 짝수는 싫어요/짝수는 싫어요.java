class Solution {
    public int[] solution(int n) {
        int len = n%2==1 ? n/2+1 : n/2;
        int[] answer = new int[len];
        int index = 0;
        for(int i=1; i<=n; i+=2) answer[index++] = i;
        return answer;
    }
}