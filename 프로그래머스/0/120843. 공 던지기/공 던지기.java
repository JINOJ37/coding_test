class Solution {
    public int solution(int[] numbers, int k) {
        return (2*k-1)%numbers.length == 0 ? numbers.length : (2*k-1)%numbers.length;
    }
}