class Solution {
    public int solution(int n) {
        int f = 1;
        int i = 1;
        while(f<=n){
            f *= i;
            i++;
        }
        return i-2;
    }
}