import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int h = triangle.length;
        int[] sum = new int[h];
        
        sum[0] = triangle[0][0];
        
        for(int i=1; i<h; i++){ // i가 1
            int[] newSum = new int[i+1];
            for(int j=0; j<=i; j++){ // 3, 8 -> 0,1
                if(j==0) newSum[j] = triangle[i][j] + sum[j];
                else if(j==i) newSum[j] = triangle[i][j] + sum[i-1];
                else    newSum[j] = Math.max(triangle[i][j] + sum[j-1], triangle[i][j] + sum[j]);
            }
            sum = newSum;
        }
        
        Arrays.sort(sum);
        return sum[h-1];
    }
}