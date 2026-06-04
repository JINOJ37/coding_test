class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr[0].length;
        int col = arr.length;
        
        if(col > row){
            int[][] answer = new int[col][col];
            for(int i=0; i<col; i++){
                for(int j=0; j<col; j++){
                    if(j>=row) answer[i][j] = 0;
                    else answer[i][j] = arr[i][j];
                }
            }
            return answer;
        } else if(col < row){
            int[][] answer = new int[row][row];
            for(int i=0; i<row; i++){
                for(int j=0; j<row; j++){
                    if(i>=col) answer[i][j] = 0;
                    else answer[i][j] = arr[i][j];
                }
            }
            return answer;
        } else return arr;
    }
}