import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 0; i<num ; i++){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;

            boolean isFound = false;
            int lcm = getLCM(m, n);

            for(int k = x; k<lcm ; k+=m){
                if(k%n == y){
                    System.out.println(k+1);
                    isFound = true;
                    break;
                }
            }
            if(!isFound)
                System.out.println(-1);
        }
    }

    public static int getGCD(int a, int b){
        if(b==0) return a;
        return getGCD(b, a%b);
    }

    public static int getLCM(int a, int b){
        return (a*b) / getGCD(a,b);
    }
}