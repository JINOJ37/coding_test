import java.util.*;

public class Main{
    static int n, m;
    static int[] result;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        result = new int[m];
        visited = new boolean[n+1];

        dfs(0);
        System.out.print(sb);
    }

    public static void dfs(int depth){
        if(depth == m){
            for(int i = 0; i<m; i++){
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 1; i<=n; i++){
            if(!visited[i]){
                visited[i] = true;
                result[depth] = i;
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }
}