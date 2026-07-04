class Solution {
    public long solution(int a, int b) {
        long count = Math.abs(a-b) + 1;
        return (long)(a+b)*count/2;
    }
}