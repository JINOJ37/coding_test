import java.util.*;

public class Main {
    static int N;
    static boolean[] isBroken = new boolean[10];
    static int minPress;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();

        for (int i = 0; i < M; i++) {
            isBroken[sc.nextInt()] = true;
        }

        minPress = Math.abs(N - 100);

        findCombination("");

        System.out.println(minPress);
    }

    public static void findCombination(String currentChannel) {
        if (!currentChannel.isEmpty()) {
            int channel = Integer.parseInt(currentChannel);
            int press = currentChannel.length() + Math.abs(N - channel);
            minPress = Math.min(minPress, press);
        }

        if (currentChannel.length() == 6) {
            return;
        }

        for (int i = 0; i < 10; i++) {
            if (!isBroken[i]) {
                findCombination(currentChannel + i);
            }
        }
    }
}