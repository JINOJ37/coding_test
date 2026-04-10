import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();
        int year = 1;

        while (true) { 
            if((year-e)%15 == 0 && (year-s)%28 == 0 && (year-m)%19 == 0){
                break;
            }
            year++;
        }   

        System.out.println(year);
    }
}