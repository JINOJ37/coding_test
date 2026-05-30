class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        double i=0;
        while(true){
            if(Math.pow(2, i) >= len) break;
            i++;
        }
        int newlen = (int)Math.pow(2.0,i);
        int[] answer = new int[newlen];
        for(int j=0; j<newlen; j++){
            if(j<len) answer[j] = arr[j];
            else answer[j] = 0;
        }
        return answer;
    }
}