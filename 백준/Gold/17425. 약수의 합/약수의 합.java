import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int max = 1000000;

        long[] f = new long[max + 1];
        Arrays.fill(f,1);
        for(int i = 2; i <= max; i++){
            for(int j = 1; i*j<=max; j++){
                f[i*j] += i;
            }
        }

        long[] g = new long[max + 1];
        for(int i = 1; i<=max; i++){
            g[i] = g[i-1] + f[i];
        }

        int t = Integer.parseInt(br.readLine().trim());

        for(int i = 0; i < t ; i++){
            int n = Integer.parseInt(br.readLine().trim());
            sb.append(g[n]).append("\n");
        }

        System.out.print(sb);
    }
}