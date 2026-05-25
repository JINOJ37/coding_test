class Solution {
    public int solution(int[] num_list) {
        boolean isSum = true;
        int answer = 0;
        if(num_list.length < 11) {
            isSum = false;
            answer = 1;
        }
        for(int num : num_list){
            if(isSum) answer+=num;
            else answer*=num;
        }
        return answer;
    }
}