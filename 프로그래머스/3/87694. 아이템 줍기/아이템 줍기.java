import java.util.*;

class Solution {
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int[][] maps = new int[101][101];
        
        for(int[] r : rectangle){
            int x1 = r[0]*2, y1 = r[1]*2;
            int x2 = r[2]*2, y2 = r[3]*2;
            
            for(int i=x1; i<=x2; i++){
                for(int j=y1; j<=y2; j++){
                    if(i>x1 && i<x2 && j>y1 && j<y2){
                        maps[i][j] = 2;
                    } else{
                        if(maps[i][j] != 2) maps[i][j] = 1;
                    }
                }
            }
        }
    
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{characterX*2, characterY*2, 0});
    
        boolean[][] visited = new boolean[101][101];
        visited[characterX*2][characterY*2] = true;
    
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
            
        while(!q.isEmpty()){
            int[] temp = q.poll();
            int x = temp[0];
            int y = temp[1];
            int dist = temp[2];
            
            if(x == itemX*2 && y == itemY*2){
                return dist/2;
            }
            
            for(int i=0; i<4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
                
                if (nx >= 0 && nx <= 100 && ny >= 0 && ny <= 100) {
                    if(maps[nx][ny] == 1 && !visited[nx][ny]){
                        visited[nx][ny] = true;
                        q.offer(new int[]{nx, ny, dist+1});
                    }
                }
            }
            
        }
        return 0;
    }
}