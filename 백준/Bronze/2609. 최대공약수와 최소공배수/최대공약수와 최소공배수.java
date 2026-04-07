import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a>b) ? gcd(a,b) : gcd(b,a);
        int d = a*b/c;
        
        System.out.println(c);
        System.out.println(d);
    }

    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
}