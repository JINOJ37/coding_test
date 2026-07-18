class Solution {
    public int[] solution(int n) {
        int[][] tri = new int[n][n];
        int[] dr = {1, 0, -1};
        int[] dc = {0, 1, -1};
        int r=0, c=0, d=0, total = n*(n+1)/2;
        
        for(int i=1; i<=total; i++){
            tri[r][c] = i;
            int nr = r+dr[d], nc = c+dc[d];
            if(nr<0 || nr>=n || nc<0 || nc>nr || tri[nr][nc]!=0){
                d = (d+1) % 3;
                nr=r+dr[d]; nc=c+dc[d];
            }
            r=nr; c=nc;
        }
        
        int[] answer = new int[total];
        int index = 0;
        
        for(int i=0 ; i<n; i++){
            for(int j=0; j<=i; j++){
                answer[index++] = tri[i][j];
            }
        }
        
        return answer;
    }
}