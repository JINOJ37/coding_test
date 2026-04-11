import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] broken = new boolean[10];

        for(int i = 0; i<m; i++){
            broken[sc.nextInt()] = true;
        }

        int minPress = Math.abs(n-100);

        for(int i = 0; i<=1000000; i++){
            String num = String.valueOf(i);
            boolean isPossible = true;
    
            for(int j = 0; j<num.length(); j++){
                if(broken[num.charAt(j) - '0']){
                    isPossible = false;
                    break;
                }
            }
            
            if(isPossible){
                int press = num.length() + Math.abs(i-n);
                minPress = Math.min(minPress, press);
            }
        }
        System.out.println(minPress);

    }
}