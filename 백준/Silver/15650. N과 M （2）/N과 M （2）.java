import java.util.*;

public class Main {
    static int n, m;
    static int[] result;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        result = new int[m];

        dfs(1, 0); 
        System.out.print(sb);
    }

    public static void dfs(int start, int depth) {
        if (depth == m) {
            for (int val : result) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i <= n; i++) {
            result[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }
}