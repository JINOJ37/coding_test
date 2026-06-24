class Solution {
    public int solution(int a, int b) {
        int mother = b/gcd(a,b);
        while(mother%2==0 || mother%5==0){
            if(mother%2==0) mother/=2;
            if(mother%5==0) mother/=5;
        }
        return mother==1 ? 1 : 2;
    }
    
    public int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}