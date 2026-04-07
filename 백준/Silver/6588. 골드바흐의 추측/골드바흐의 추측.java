import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int max = 1000000;
        boolean[] isNotPrime = new boolean[max + 1];
        isNotPrime[0] = isNotPrime[1] = true;
        for(int i = 2; i*i <= max; i++){
            if(!isNotPrime[i]){
                for(int j = i*i; j<=max; j+= i){
                    isNotPrime[j] = true;
                }
            }
        }

        while (true) { 
            int n = Integer.parseInt(br.readLine().trim());
            if(n == 0) break;
            boolean found = false;

            for(int i = 3; i <= n / 2 ; i+=2){
                if(!isNotPrime[i] && !isNotPrime[n-i]){
                    sb.append(n).append(" = ").append(i).append(" + ").append(n - i).append("\n");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Goldbach's conjecture is wrong.\n");
            }
        }
        System.out.println(sb);
    }
}