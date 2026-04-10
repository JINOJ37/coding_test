import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] arr = new char[n][n];

        for(int i = 0; i<n; i++){
            String line = sc.next();
            for(int j = 0; j<n; j++){
                arr[i][j] = line.charAt(j);
            }
        }

        int maxValue = 0;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(j < n-1){
                    swap(arr, i, j, i, j+1);
                    maxValue = Math.max(maxValue, check(arr));
                    swap(arr, i, j, i, j+1);
                }
                    
                if(i < n-1){
                    swap(arr, i, j, i+1, j);
                    maxValue = Math.max(maxValue, check(arr));
                    swap(arr, i, j, i+1, j);
                }
            }
        }

        System.out.println(maxValue);
    }

    public static void swap(char[][] board, int x1, int y1, int x2, int y2){
        char temp = board[x1][y1];
        board[x1][y1] = board[x2][y2];
        board[x2][y2] = temp;
    }

    public static int check(char[][] board){
        int n = board.length;
        int max = 1;

        for(int i = 0; i<n; i++){
            int raw = 1;
            int col = 1;
            for(int j = 0; j<n-1 ; j++){
                if(board[i][j] == board[i][j+1]){
                    raw++;
                } else{
                    raw = 1;
                }
                max = Math.max(max, raw);
                if(board[j][i] == board[j+1][i]){
                    col ++;
                } else{
                    col = 1;
                }
                max = Math.max(max, col);
            }
        }

        return max;
    }
}