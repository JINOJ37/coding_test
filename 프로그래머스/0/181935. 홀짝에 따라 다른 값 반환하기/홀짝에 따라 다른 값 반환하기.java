class Solution {
    public int solution(int n) {
        int result = 0;
        if(n%2==1){
            for(int i = n; i>=1; i-=2){
                result += i;
            }
        } else{
            for(int i = n; i>=2; i-=2){
                result += i*i;
            }
        }
        return result;
    }
}