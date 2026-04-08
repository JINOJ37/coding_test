import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 9;
        int[] h = new int[num];
        int sum = 0;

        for(int i=0; i<num; i++){
            h[i] = sc.nextInt();
            sum += h[i];
        }

        int findNum = sum-100;
        boolean found = false;

        for(int i =0 ; i<num ; i++){
            for(int j = i+1; j<num ; j++){
                if(h[i]+h[j] == findNum){
                    h[i] = h[j] = 100;
                    found = true;
                    break;
                }
            }
            if(found) break;
        }

        Arrays.sort(h);

        for(int i = 0; i<7; i++){
            System.out.println(h[i]);
        }
    }
}