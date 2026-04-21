import java.util.Arrays;
class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int x=0, y=0;
        int[][] way = new int[m][n];
        way[0][0] = 1;
        
        for(int[] puddle : puddles){
            way[puddle[0]-1][puddle[1]-1] = -1;
        }
        
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(i==0 && j==0) continue;
                if(way[i][j] == -1){
                    way[i][j] = 0;
                    continue;
                }
                if(i==0 && j!=0) way[i][j] = way[i][j-1];
                else if(i!=0 && j==0) way[i][j] = way[i-1][j];
                else{
                    way[i][j] = (way[i-1][j] + way[i][j-1])%1000000007;
                }
            }
        }
        
        return way[m-1][n-1];
    }
}