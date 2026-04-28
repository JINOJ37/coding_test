import java.util.Arrays;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        Arrays.sort(rocks);
        
        int answer = 0;
        int left = 1;
        int right = distance;
        
        while(left<=right){
            int mid = (left+right)/2;
            
            int removedRocks = 0;
            int currentPos = 0;
            
            for(int rock : rocks){
                if(rock - currentPos < mid) removedRocks++;
                else currentPos = rock;
            }
            if(distance - currentPos < mid) removedRocks++;
            
            if(removedRocks <= n){
                answer = mid;
                left = mid+1;
            } else{
                right = mid-1;
            }
        }
        
        return answer;
        
    }
}