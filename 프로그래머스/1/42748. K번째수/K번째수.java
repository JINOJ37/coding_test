import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int n = commands.length; // 3
        int[] result = new int[n];
        int x = 0;
        
        for(int[] command : commands){
            int i = command[0];
            int j = command[1];
            int k = command[2];
            
            int[] tempArray = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(tempArray);
            result[x++] = tempArray[k-1];
        }
        
        return result;
    }
}