class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int[] answer = new int[len+1];
        int i = 0;
        for(int num : num_list){
            answer[i++] = num;
        }
        if(num_list[len-1] > num_list[len-2]){
            answer[len] = num_list[len-1]-num_list[len-2];
        } else{
            answer[len] = num_list[len-1]*2;
        }
        return answer;
    }
}