class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        boolean[][] check = new boolean[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == 1){
                    
                    int startRow = Math.max(0, i - 1);
                    int endRow = Math.min(n - 1, i + 1);
                    int startCol = Math.max(0, j - 1);
                    int endCol = Math.min(n - 1, j + 1);
                    
                    for(int k = startRow; k <= endRow; k++){
                        for(int l = startCol; l <= endCol; l++){
                            check[k][l] = true;
                        }
                    }
                }
            }
        }
        
        int answer = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(!check[i][j]){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}