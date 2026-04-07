import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        for(int i = m; i<=n; i++){
            printPrime(i);
        }
    }

    public static void printPrime(int n){
        if(n<2) return;
        for (int i=2; i*i<=n; i++){
            if(n%i == 0) return;
        }
        System.out.println(n);
    }
}