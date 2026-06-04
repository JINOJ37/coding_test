class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int x=0, y=0, c=1;
        for(int i=1; i<=n*n; i++){
            answer[y][x] = i;
            switch(c){
                case 1: if(x+1<n && answer[y][x+1] == 0) {x++; continue;}
                    else c=2;
                case 2: if(y+1<n && answer[y+1][x] == 0) {y++; continue;}
                    else c=3;
                case 3: if(x-1>=0 && answer[y][x-1] == 0) {x--; continue;}
                    else c=4;
                case 4: if(y-1>=0 && answer[y-1][x] == 0) {y--; continue;}
                    else {c=1; x++;}
            }
        }
        
        return answer;
    }
}