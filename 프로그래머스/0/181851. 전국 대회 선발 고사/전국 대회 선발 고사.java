import java.util.Arrays;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int limit = 1;
        for(int i = 1; i <= rank.length; i++){
            if(limit > 3) break;
            for(int j = 0; j < rank.length; j++){
                if(rank[j] == i && attendance[j]){
                    answer = (answer + j) * 100;
                    limit ++;
                    break;
                }
            }
        }
        return answer/100;
    }
}