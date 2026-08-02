class Solution {
    public double solution(int[] arr) {
        int answer = 0;
        for(int n : arr){
            answer += n;
        }
        return (double)answer/(double)arr.length;
    }
}