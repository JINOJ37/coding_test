class Solution {
    int[][] memo = new int[31][31];
    
    public int solution(int balls, int share) {
        return find(balls, share);
    }
    
    public int find(int b, int s){
        if(s==0 || s==b) return 1;
        if(memo[b][s] != 0) return memo[b][s];
        return memo[b][s] = find(b - 1, s - 1) + find(b - 1, s);
    }
}