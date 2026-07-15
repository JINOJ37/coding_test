class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        int[][] table = new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                table[i][j] = columns*i + (j+1);
            }
        }
        
        int i = 0;
        
        for(int[] q : queries){
            int x = q[1]-1;
            int y = q[0]-1;
            int value = table[y][x];
            int min = value;
            int r = 1;
            
            while(r != 5){
                int temp = 0;
                if(r == 4){
                    temp = table[y-1][x];
                    table[y-1][x] = value;
                    y--;
                    if(y == q[0]-1) r++;
                } else if(r == 3){
                    temp = table[y][x-1];
                    table[y][x-1] = value;
                    x--;
                    if(x == q[1]-1) r++;
                } else if(r == 2){
                    temp = table[y+1][x];
                    table[y+1][x] = value;
                    y++;
                    if(y == q[2]-1) r++;
                } else if(r == 1){
                    temp = table[y][x+1];
                    table[y][x+1] = value;
                    x++;
                    if(x == q[3]-1) r++;
                } 
                
                value = temp;
                min = Math.min(min, value);
            }
            
            answer[i++] = min;
        }
        
        return answer;
    }
}