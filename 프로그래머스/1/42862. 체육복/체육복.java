import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] check = new int[n];
        Arrays.fill(check, 1);
        
        for(int i : lost){
            check[i-1]--;
        }
        for(int i : reserve){
            check[i-1]++;
        }
        
        Arrays.sort(lost);
        
        for(int i : lost){
            if(check[i-1] == 1){
                continue;
            }
            if(i-2>=0){
                if(check[i-2] > 1){
                    check[i-1] ++;
                    check[i-2] --;
                    continue;
                }
            } 
            if(i<n){
                if(check[i] > 1){
                    check[i-1] ++;
                    check[i]--;
                }
            }
        }
        
        int result = 0; 
        
        for(int i : check){
            if(i >= 1){
                result++;
            }
        }
        
        return result;
        
    }
}