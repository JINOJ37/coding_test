import java.util.*;
class Solution {
    public int[] solution(int n) {
        
        List<int[]> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(new int[i+1]);
        }
        
        int num = 1;
        int pos = -1;
        for(int i=1; i<=n; i++){
            if(i%3 == 1){
                pos++;
                for(int j=0; j<=n-i; j++){
                    list.get(pos++)[i/3] = num++;
                }
            } else if(i%3 == 2){
                pos--;
                for(int j=0; j<=n-i; j++){
                    list.get(pos)[i/3+j+1] = num++;
                }
            } else{
                for(int j=0; j<=n-i; j++){
                    pos--;
                    list.get(pos)[list.get(pos).length-(i/3)] = num++;
                }
            }
        }
        
        int[] answer = new int[num-1];
        int index = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                answer[index++] = list.get(i)[j];
            }
        }
        
        return answer;
    }
}