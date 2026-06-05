class Solution {
    public int solution(int n) {
        int gcd = gcd(n,6);
        return n/gcd;
    }
    
    public int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}