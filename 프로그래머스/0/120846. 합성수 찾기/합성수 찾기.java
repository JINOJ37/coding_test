class Solution {
    public int solution(int n) {
        int[] count = new int[101];
        
        for(int i=1; i<=100; i++){
            for(int j=1; i*j<=100; j++)
                count[i*j]++;
        }
        
        int answer = 0;
        
        for(int x=1; x<=n; x++){
            if(count[x]>=3) answer++;
        }
        
        return answer;
    }
}