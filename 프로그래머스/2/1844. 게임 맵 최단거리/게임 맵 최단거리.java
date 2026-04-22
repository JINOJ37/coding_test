import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        
        int n = maps.length;
        int m = maps[0].length;
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        
        while(!q.isEmpty()){
            int[] current = q.poll();
            int x= current[0];
            int y= current[1];
            
            for(int i = 0; i<4; i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
                
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }
                
                if(maps[nx][ny] == 0 || maps[nx][ny] > 1)
                    continue;
                
                maps[nx][ny] = maps[x][y] + 1;
                q.offer(new int[]{nx, ny});
            }
        }
        
        int answer = maps[n-1][m-1];
        
        if(answer == 1){
            return -1;
        }
        
        return answer;
    }
}