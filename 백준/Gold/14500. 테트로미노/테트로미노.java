import java.util.*;

public class Main{
    static int max = 0;
    static int arr[][];
    static boolean[][] visited;
    static int n, m;

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                dfs(i, j, 1, arr[i][j]);
                checkT(i, j);
            }
        }

        System.out.println(max);

    }

    static void dfs(int x, int y, int depth, int sum){
        if(depth == 4){
            max = Math.max(max, sum);
            return;
        }

        visited[x][y] = true;

        for(int i = 0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(0 <= nx && nx < n && 0 <= ny && ny < m && !visited[nx][ny]){
                dfs(nx, ny, depth+1, sum+arr[nx][ny]);
            }
        }
        
        visited[x][y] = false;
    }

    static void checkT(int x, int y){
        for (int i = 0 ; i<4; i++){
            int sum = arr[x][y];
            boolean isPossible = true;
            
            for(int j = 0; j<3; j++){
                int temp = (i+j) % 4;
                int nx = x + dx[temp];
                int ny = y + dy[temp];

                if(0 <= nx && nx < n && 0 <= ny && ny < m){
                    sum += arr[nx][ny];
                } else{
                    isPossible = false;
                    break;
                }
            }
            if (isPossible) max = Math.max(max, sum);
        }
    }
}