import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] arr = new char[n][n];

        // 1. 보드 입력 받기
        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < n; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        int maxCandy = 0;

        // 2. 전체 보드 순회하며 인접한 사탕 교환 시도
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 오른쪽 사탕과 교환 (범위 체크 필수)
                if (j + 1 < n) {
                    swap(arr, i, j, i, j + 1);
                    maxCandy = Math.max(maxCandy, check(arr));
                    swap(arr, i, j, i, j + 1); // 원상복구
                }

                // 아래쪽 사탕과 교환 (범위 체크 필수)
                if (i + 1 < n) {
                    swap(arr, i, j, i + 1, j);
                    maxCandy = Math.max(maxCandy, check(arr));
                    swap(arr, i, j, i + 1, j); // 원상복구
                }
            }
        }

        System.out.println(maxCandy);
    }

    // 두 사탕의 위치를 바꾸는 함수
    public static void swap(char[][] board, int x1, int y1, int x2, int y2) {
        char temp = board[x1][y1];
        board[x1][y1] = board[x2][y2];
        board[x2][y2] = temp;
    }

    // 현재 보드에서 가장 긴 연속 부분의 길이를 찾는 함수
    public static int check(char[][] board) {
        int n = board.length;
        int max = 1;

        for (int i = 0; i < n; i++) {
            int rowCount = 1;
            int colCount = 1;
            for (int j = 1; j < n; j++) {
                // 가로 연속 체크
                if (board[i][j] == board[i][j - 1]) {
                    rowCount++;
                } else {
                    rowCount = 1;
                }
                max = Math.max(max, rowCount);

                // 세로 연속 체크
                if (board[j][i] == board[j - 1][i]) {
                    colCount++;
                } else {
                    colCount = 1;
                }
                max = Math.max(max, colCount);
            }
        }
        return max;
    }
}