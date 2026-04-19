import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int n = sizes.length;
        int[] w = new int[n];
        int[] h = new int[n];
        
        for(int i = 0; i<n; i++){
            int[] size = sizes[i];
            w[i] = (size[0] > size[1]) ? size[0]: size[1];
            h[i] = (size[0] <= size[1]) ? size[0]: size[1];
        }
        
        int result = 1;
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                result = Math.max(result, w[i]*h[j]);
            }
        }
        
        return result;
    }
}