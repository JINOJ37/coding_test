import java.util.Arrays;
class Solution {
    public long solution(long n) {
        String num = String.valueOf(n);
        int[] num_list = new int[num.length()];
        
        for(int i=0; i<num_list.length; i++){
            num_list[i] = num.charAt(i) - '0';
        }
        
        Arrays.sort(num_list);
        
        long answer = 0;
        for(int i=0; i<num_list.length; i++){
            answer = answer*10 + num_list[num_list.length-i-1];
        }
        
        return answer;
    }
}